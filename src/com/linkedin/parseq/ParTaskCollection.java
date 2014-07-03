package com.linkedin.parseq;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import com.linkedin.parseq.BaseFoldTask.Step;


/**
 * @author Jaroslaw Odzga (jodzga@linkedin.com)
 */
public class ParTaskCollection<T> extends TaskCollection<T> {

  public ParTaskCollection(final Iterable<Task<T>> tasks)
  {
    this(tasks, Function.identity());
  }

  public <A> ParTaskCollection(final Iterable<Task<A>> tasks, Function<Task<A>, Task<T>> f)
  {
    super(tasks, f);
  }

  @Override
  <A> TaskCollection<A> createCollection(Iterable<Task<T>> tasks, Function<Task<T>, Task<A>> f) {
    return new ParTaskCollection<>(tasks, f);
  }

  @Override
  <Z> Task<Z> createFoldTask(String name, Z zero, BiFunction<Z, T, Step<Z>> op) {
    return new ParFoldTask<Z, T>(name, _tasks, zero, op);
  }

  public Task<List<T>> results(final String name) {
    return new ParTaskImpl<T>(name, _tasks);
  }

}
