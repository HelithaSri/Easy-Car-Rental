package com.esaycarrental.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Helitha Sri
 * @created 7/6/2022 - 3:10 PM
 * @project Esay Car Rental
 */

@Configuration
@Import(JPAConfig.class)
public class WebRootConfig {
}
