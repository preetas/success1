package com.luwojtaszek.springbootjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
 
@SpringBootApplication
@ComponentScan(basePackages= {"com.luwojtaszek"}
public class SpringBootJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJspApplication.class, args);
	}
}
