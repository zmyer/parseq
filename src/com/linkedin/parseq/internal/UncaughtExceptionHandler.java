package com.linkedin.parseq.internal;

/**
 * A handler that is invoked whenever the {@link SerialExecutor}'s execution loop
 * throws an uncaught exception.
 */
// TODO: 2018/7/25 by zmyer
public interface UncaughtExceptionHandler {
    /**
     * This method is invoked whenever a {@link SerialExecutor}'s execution loop throws
     * an uncaught exception
     *
     * @param error the error that was raised by the underlying executor.
     */
    void uncaughtException(Throwable error);
}
