package com.esaycarrental.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Helitha Sri
 * @created 7/6/2022 - 3:12 PM
 * @project Easy Car Rental
 */

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.esaycarrental.spring")
public class WebAppConfig {
}
