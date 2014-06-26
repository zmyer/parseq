/* $Id$ */
package com.linkedin.parseq.example.functional.simple;

import static com.linkedin.parseq.example.common.ExampleUtil.fetchUrl;

import java.util.Arrays;
import java.util.List;

import com.linkedin.parseq.Engine;
import com.linkedin.parseq.Task;
import com.linkedin.parseq.Tasks;
import com.linkedin.parseq.example.common.AbstractExample;
import com.linkedin.parseq.example.common.ExampleUtil;
import com.linkedin.parseq.example.common.MockService;

/**
 * @author Jaroslaw Odzga (jodzga@linkedin.com)
 */
public class FunctionalFanOutExample extends AbstractExample
{
  public static void main(String[] args) throws Exception
  {
    new FunctionalFanOutExample().runExample();
  }

  @Override
  protected void doRunExample(final Engine engine) throws Exception
  {
    final MockService<String> httpClient = getService();
    List<String> urls = Arrays.asList("http://www.bing.com", "http://www.yahoo.com", "http://www.google.com");

    final Task<?> parFetch = urls.stream()
                            .map(url -> fetchUrl(httpClient, url).andThen("printResults", System.out::println))
                            .collect(Tasks.toPar());
    engine.run(parFetch);

    parFetch.await();

    ExampleUtil.printTracingResults(parFetch);
  }
}
