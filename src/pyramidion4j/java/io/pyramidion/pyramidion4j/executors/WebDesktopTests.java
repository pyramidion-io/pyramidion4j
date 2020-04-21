package io.pyramidion.pyramidion4j.executors;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"classpath:features/"},
    strict = true,
    plugin = {"pretty",
        "json:target/pyramidion4j-reports/results.json",
        "junit:target/pyramidion4j-reports/results.xml",
        "html:target/pyramidion4j-reports/html",
        "timeline:target/pyramidion4j-reports/timeline",
        "usage:target/pyramidion4j-reports/usage.json"})
public class WebDesktopTests {
}
