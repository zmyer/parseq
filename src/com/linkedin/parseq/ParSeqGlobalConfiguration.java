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


/**
 * Global parseq configuration, applies to all Engine and Task instances
 *
 * @author Oleg Anashkin (oanashkin@linkedin.com)
 * @author Jaroslaw Odzga (jodzga@linkedin.com)
 */
public final class ParSeqGlobalConfiguration {
  private static volatile boolean _crossThreadStackTracesEnabled = false;
  private static volatile boolean _trampolineEnabled = false;

  private ParSeqGlobalConfiguration() {
  }

  /**
   * Returns current state of cross-thread (cross-task) stack tracing.
   *
   * Normally tasks are executed in a different thread from the one creating it and at a different time. This makes it
   * hard to debug because if a task throws an exception, its call stack ends in the execution engine that actually
   * starts a thread that serves the task. This feature collects stack trace in advance, when task is created, so that
   * if a task throws an exception then the parent stack trace is appended to it. This has a small performance
   * impact even if the task doesn't throw any exceptions because stack trace is collected in task constructor.
   *
   * @return true if cross-thread stack tracing is enabled, false otherwise
   */
  public static boolean isCrossThreadStackTracesEnabled() {
    return _crossThreadStackTracesEnabled;
  }

  /**
   * Modifies the current state of cross-thread (cross-task) stack tracing.
   * This is a dynamic runtime configuration that has immediate effect on all tasks in the current process.
   *
   * Normally tasks are executed in a different thread from the one creating it and at a different time. This makes it
   * hard to debug because if a task throws an exception, its call stack ends in the execution engine that actually
   * starts a thread that serves the task. This feature collects stack trace in advance, when task is created, so that
   * if a task throws an exception then the parent stack trace is appended to it. This has a small performance
   * impact even if the task doesn't throw any exceptions because stack trace is collected in task constructor.
   *
   * @param enabled true if cross-thread stack tracing is enabled, false otherwise
   */
  public static void setCrossThreadStackTracesEnabled(boolean enabled) {
    _crossThreadStackTracesEnabled = enabled;
  }

  /**
   * Returns true if trampoline is currently enabled.
   *
   * Trampoline prevents stack overflow in situation of extremely deep large ParSeq plans. Typically this problem
   * does not occur and trampoline can be disabled allowing performance optimization.
   *
   * @return true if trampoline is currently enabled
   */
  public static boolean isTrampolineEnabled() {
    return _trampolineEnabled;
  }

  /**
   * Enables or disables trampoline.
   * This is a dynamic runtime configuration that has immediate effect on all tasks in the current process.
   *
   * Trampoline prevents stack overflow in situation of extremely deep ParSeq plans. Typically this problem
   * does not occur and trampoline can be disabled allowing performance optimization.
   *
   * @param enabled
   */
  public static void setTrampolineEnabled(boolean enabled) {
    _trampolineEnabled = enabled;
  }

}
