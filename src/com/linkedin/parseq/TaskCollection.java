package com.linkedin.parseq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.linkedin.parseq.BaseFoldTask.Step;

/**
 * @author Jaroslaw Odzga (jodzga@linkedin.com)
 */
public abstract class TaskCollection<T> {

  protected final List<Task<T>> _tasks;

  public TaskCollection(final Iterable<Task<T>> tasks)
  {
    this(tasks, Function.identity());
  }

  public <A> TaskCollection(final Iterable<Task<A>> tasks, Function<Task<A>, Task<T>> f)
  {
    List<Task<T>> taskList = new ArrayList<Task<T>>();
    for(Task<A> task : tasks)
    {
      taskList.add(f.apply(task));
    }
    if (taskList.size() == 0)
    {
      throw new IllegalArgumentException("No tasks!");
    }
    _tasks = Collections.unmodifiableList(taskList);
  }

  abstract <A> TaskCollection<A> createCollection(Iterable<Task<T>> tasks, Function<Task<T>, Task<A>> f);
  abstract <Z> Task<Z> createFoldTask(String name, Z zero, final BiFunction<Z, T, Step<Z>> op);

  public <A> TaskCollection<A> map(final String desc, final Function<T, A> f) {
    return createCollection(_tasks, t -> t.map(desc, f));
  }

  public TaskCollection<T> forEach(final String desc, final Consumer<T> consumer) {
    return createCollection(_tasks, t -> t.andThen(desc, consumer));
  }

  public <B> Task<B> fold(final String name, final B zero, final BiFunction<B, T, B> op) {
    return createFoldTask("fold: " + name, zero, (z, e) -> Step.cont(op.apply(z, e)));
  }

  public Task<T> reduce(final String name, final BiFunction<T, T, T> op) {
    boolean first = true;
    return createFoldTask("reduce: " + name, null, (z, e) -> {
      if (first) {
        return Step.cont(e);
      } else {
        return Step.cont(op.apply(z, e));
      }
    });
  }

  public Task<Optional<T>> find(final String name, final Predicate<T> predicate) {
    return createFoldTask("find: " + name, Optional.empty(), (z, e) -> {
      if (predicate.test(e)) {
        return Step.done(Optional.of(e));
      } else {
        return Step.cont(z);
      }
    });
  }

  public Task<List<T>> filter(final String name, final Predicate<T> predicate) {
    return createFoldTask("filter: " + name, new ArrayList<T>(), (z, e) -> {
      if (predicate.test(e)) {
        z.add(e);
      }
      return Step.cont(z);
    });
  }

  public Task<List<T>> take(final String name, final int n) {
    return createFoldTask("take " + n + ": " + name, new ArrayList<T>(), (z, e) -> {
      z.add(e);
      if (z.size() == n) {
        return Step.done(z);
      } else {
        return Step.cont(z);
      }
    });
  }

  public Task<List<T>> takeWhile(final String name, final Predicate<T> predicate) {
    return createFoldTask("takeWhile: " + name, new ArrayList<T>(), (z, e) -> {
      if (predicate.test(e)) {
        z.add(e);
        return Step.cont(z);
      } else {
        return Step.done(z);
      }
    });
  }

}
