package com.ustglobal.springcore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration	// Indicates that a class declares one or more @Bean methods 
@ComponentScan(basePackages = "com.ustglobal.springcore.di")	//  Configures component scanning directives for use with @Configuration classes
public class ComponentScanConfiguration {
	
	
}
