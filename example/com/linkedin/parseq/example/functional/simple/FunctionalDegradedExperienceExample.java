/* $Id$ */
package com.linkedin.parseq.example.functional.simple;

import static com.linkedin.parseq.example.common.ExampleUtil.*;

import java.util.concurrent.TimeUnit;

import com.linkedin.parseq.Engine;
import com.linkedin.parseq.Task;
import com.linkedin.parseq.example.common.AbstractExample;
import com.linkedin.parseq.example.common.ExampleUtil;
import com.linkedin.parseq.example.common.MockService;

public class FunctionalDegradedExperienceExample extends AbstractExample
{
  public static void main(String[] args) throws Exception
  {
    new FunctionalDegradedExperienceExample().runExample();
  }

  @Override
  protected void doRunExample(final Engine engine) throws Exception
  {
    final MockService<String> httpClient = getService();


    final Task<Integer> fetchAndLength =
        fetchUrl(httpClient, "http://www.google.com", 100)
          .within("timeout", 50, TimeUnit.MILLISECONDS)
          .recover("default", t -> "")
          .map("length", s -> s.length());

    engine.run(fetchAndLength);

    fetchAndLength.await();

    System.out.println("Response length: " + fetchAndLength.get());

    ExampleUtil.printTracingResults(fetchAndLength);
  }
}