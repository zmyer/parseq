/*
 * Copyright 2012 LinkedIn, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.linkedin.parseq;

import java.util.List;
import java.util.function.BiFunction;

/**
 * @author Jaroslaw Odzga (jodzga@linkedin.com)
 */
/* package private */ class SeqFoldTask<B, T> extends BaseFoldTask<B, T>
{
  public SeqFoldTask(final String name, final Iterable<? extends Task<T>> tasks, final B zero, final BiFunction<B, T, Step<B>> op)
  {
    super(name, tasks, zero, op);
  }


  @Override
  void scheduleTasks(List<Task<T>> tasks, Context context) {
    Task<?> prevTask = tasks.get(0);
    for (int i = 1; i < tasks.size(); i++)
    {
      final Task<?> currTask = tasks.get(i);
      context.after(prevTask).run(currTask);
      prevTask = currTask;
    }
    context.run(tasks.get(0));
  }

}
