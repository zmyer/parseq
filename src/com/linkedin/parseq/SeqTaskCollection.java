package com.linkedin.parseq;

import java.util.function.BiFunction;
import java.util.function.Function;

import com.linkedin.parseq.BaseFoldTask.Step;


/**
 * @author Jaroslaw Odzga (jodzga@linkedin.com)
 */
public class SeqTaskCollection<T> extends TaskCollection<T> {

  public SeqTaskCollection(final Iterable<Task<T>> tasks)
  {
    this(tasks, Function.identity());
  }

  public <A> SeqTaskCollection(final Iterable<Task<A>> tasks, Function<Task<A>, Task<T>> f)
  {
    super(tasks, f);
  }

  @Override
  <A> TaskCollection<A> createCollection(Iterable<Task<T>> tasks, Function<Task<T>, Task<A>> f) {
    return new SeqTaskCollection<A>(tasks, f);
  }

  @Override
  <Z> Task<Z> createFoldTask(String name, Z zero, BiFunction<Z, T, Step<Z>> op) {
    return new SeqFoldTask<Z, T>(name, _tasks, zero, op);
  }

  public Task<T> result(final String name) {
    return new SeqTask<T>(name, _tasks);
  }

}
