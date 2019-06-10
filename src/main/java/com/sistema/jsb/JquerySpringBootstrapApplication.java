package com.sistema.jsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.sistema.jsf.controller")
public class JquerySpringBootstrapApplication {

	public static void main(String[] args) {
		SpringApplication.run(JquerySpringBootstrapApplication.class, args);
	}

}
