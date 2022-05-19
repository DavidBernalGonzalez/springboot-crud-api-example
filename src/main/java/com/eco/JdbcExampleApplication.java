package com.eco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "com.eco" })
@SpringBootApplication
public class JdbcExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcExampleApplication.class, args);
	}

}
