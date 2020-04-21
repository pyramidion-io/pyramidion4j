package io.pyramidion.pyramidion4j.framework.config;

import java.util.Objects;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@ComponentScan("io.pyramidion.pyramidion4j.framework")
public class Pyramidion4jConfig {
  private static final String PYRAMIDION_CONFIG_FILE_LOCATION = "pyramidion.yml";

  @Bean
  public static PropertySourcesPlaceholderConfigurer properties() {
    PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
    YamlPropertiesFactoryBean yamlPropertiesFactory = new YamlPropertiesFactoryBean();
    yamlPropertiesFactory.setResources(new ClassPathResource(PYRAMIDION_CONFIG_FILE_LOCATION));
    propertySourcesPlaceholderConfigurer.setProperties(Objects.requireNonNull(yamlPropertiesFactory.getObject()));
    return propertySourcesPlaceholderConfigurer;
  }
}
