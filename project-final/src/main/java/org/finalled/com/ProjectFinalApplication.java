package org.finalled.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="org.finalled.com")
public class ProjectFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectFinalApplication.class, args);
	}
}
