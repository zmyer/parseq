/* $Id$ */
package com.linkedin.parseq.example.functional.simple;

import static com.linkedin.parseq.example.common.ExampleUtil.fetchUrl;
import static com.linkedin.parseq.example.common.ExampleUtil.printTracingResults;

import java.util.Arrays;
import java.util.List;

import com.linkedin.parseq.Engine;
import com.linkedin.parseq.Task;
import com.linkedin.parseq.Tasks;
import com.linkedin.parseq.example.common.AbstractExample;
import com.linkedin.parseq.example.common.MockService;

/**
 * @author Jaroslaw Odzga (jodzga@linkedin.com)
 */
public class FunctionalFanInExample extends AbstractExample
{
  public static void main(String[] args) throws Exception
  {
    new FunctionalFanInExample().runExample();
  }

  @Override
  protected void doRunExample(final Engine engine) throws Exception
  {
    final MockService<String> httpClient = getService();
    List<String> urls = Arrays.asList("http://www.bing.com", "http://www.yahoo.com", "http://www.google.com");

    final Task<?> fanIn = urls.stream()
                            .map(url -> fetchUrl(httpClient, url))
                            .collect(Tasks.toPar())
                            .andThen("printResults", list -> list.stream().forEach(System.out::println));

    engine.run(fanIn);

    fanIn.await();

    printTracingResults(fanIn);
  }
}
