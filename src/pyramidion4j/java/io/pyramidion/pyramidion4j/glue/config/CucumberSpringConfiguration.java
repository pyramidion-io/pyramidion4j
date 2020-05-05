package io.pyramidion.pyramidion4j.glue.config;

import io.cucumber.spring.CucumberContextConfiguration;
import io.pyramidion.pyramidion4j.framework.config.Pyramidion4jConfig;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = Pyramidion4jConfig.class)
@CucumberContextConfiguration
public class CucumberSpringConfiguration {
}
