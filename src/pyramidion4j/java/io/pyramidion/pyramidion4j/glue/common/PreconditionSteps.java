package io.pyramidion.pyramidion4j.glue.common;

import io.cucumber.java8.En;

public class PreconditionSteps implements En {
  public PreconditionSteps() {
    Given("I am a new owner", () -> {
      System.out.println(System.getProperty("cucumber.glue"));
    });

    Given("I am a known owner", () -> {
    });

    Given("I am a known customer", () -> {
    });

    Given("I own a dog", () -> {
    });

    Given("I own a dog and a cat", () -> {
    });
  }
}
