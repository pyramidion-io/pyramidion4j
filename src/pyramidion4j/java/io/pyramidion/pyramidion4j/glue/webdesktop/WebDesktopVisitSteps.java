package io.pyramidion.pyramidion4j.glue.webdesktop;

import io.cucumber.java8.En;

public class WebDesktopVisitSteps implements En {
  public WebDesktopVisitSteps() {
    When("I record my dog's visit to the vet", () -> {
    });

    Then("a visitation record is created for my dog", () -> {
    });

    When("I record my cat's visit to the vet", () -> {
    });

    Then("a visitation record is created for both my pets", () -> {
    });

    When("I record the dog's multiple visits to the vet", () -> {
    });

    When("I record the cat's multiple visits to the vet", () -> {
    });

    Then("visitation records are created for my dog and cat", () -> {
    });
  }
}
