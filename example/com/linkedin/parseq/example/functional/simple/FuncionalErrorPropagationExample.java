/* $Id$ */
package com.linkedin.parseq.example.functional.simple;

import com.linkedin.parseq.Engine;
import com.linkedin.parseq.Task;
import com.linkedin.parseq.example.common.AbstractExample;
import com.linkedin.parseq.example.common.ExampleUtil;
import com.linkedin.parseq.example.common.MockService;

import java.util.concurrent.Callable;

import static com.linkedin.parseq.Tasks.seq;
import static com.linkedin.parseq.Tasks.callable;
import static com.linkedin.parseq.example.common.ExampleUtil.fetch404Url;

/**
 * @author Chris Pettitt (cpettitt@linkedin.com)
 */
public class FuncionalErrorPropagationExample extends AbstractExample
{
  public static void main(String[] args) throws Exception
  {
    new FuncionalErrorPropagationExample().runExample();
  }

  @Override
  protected void doRunExample(final Engine engine) throws Exception
  {
    final MockService<String> httpClient = getService();

    final Task<String> fetch = fetch404Url(httpClient, "http://www.google.com");
    final Task<Integer> fetchAndLength = fetch.map("length", x -> x.length());

    engine.run(fetchAndLength);

    fetchAndLength.await();

    System.out.println("Error while fetching url: " + fetchAndLength.getError());

    ExampleUtil.printTracingResults(fetchAndLength);
  }
}
