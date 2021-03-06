package com.linkedin.parseq;

import com.linkedin.parseq.function.Tuple10;
import com.linkedin.parseq.promise.PromiseException;
import com.linkedin.parseq.promise.PromiseListener;
import com.linkedin.parseq.promise.PromiseUnresolvedException;
import com.linkedin.parseq.trace.ShallowTrace;
import com.linkedin.parseq.trace.ShallowTraceBuilder;
import com.linkedin.parseq.trace.Trace;
import com.linkedin.parseq.trace.TraceBuilder;

import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

// TODO: 2018/7/26 by zmyer
public class Tuple10TaskDelegate<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>
        implements Tuple10Task<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> {

    private final Task<Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> _task;

    public Tuple10TaskDelegate(Task<Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> task) {
        _task = task;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean cancel(Exception reason) {
        return _task.cancel(reason);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> get() throws PromiseException {
        return _task.get();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Throwable getError() throws PromiseUnresolvedException {
        return _task.getError();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> getOrDefault(
            Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> defaultValue) throws PromiseUnresolvedException {
        return _task.getOrDefault(defaultValue);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return _task.getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPriority() {
        return _task.getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean setPriority(int priority) {
        return _task.setPriority(priority);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void await() throws InterruptedException {
        _task.await();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void contextRun(Context context, Task<?> parent, Collection<Task<?>> predecessors) {
        _task.contextRun(context, parent, predecessors);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean await(long time, TimeUnit unit) throws InterruptedException {
        return _task.await(time, unit);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShallowTrace getShallowTrace() {
        return _task.getShallowTrace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addListener(PromiseListener<Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> listener) {
        _task.addListener(listener);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Trace getTrace() {
        return _task.getTrace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isDone() {
        return _task.isDone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isFailed() {
        return _task.isFailed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long getId() {
        return _task.getId();
    }

    @Override
    public void setTraceValueSerializer(Function<Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, String> serializer) {
        _task.setTraceValueSerializer(serializer);
    }

    @Override
    public ShallowTraceBuilder getShallowTraceBuilder() {
        return _task.getShallowTraceBuilder();
    }

    @Override
    public TraceBuilder getTraceBuilder() {
        return _task.getTraceBuilder();
    }

}
