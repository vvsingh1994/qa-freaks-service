package com.qa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.qa")
@PropertySource("classpath:application.properties")
public class ApplicationConfig {

}
