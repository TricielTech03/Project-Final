package org.finalled.com;

import org.finalled.com.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="org.finalled.com") 
@EnableConfigurationProperties({
    FileStorageProperties.class
})
public class ProjectFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectFinalApplication.class, args);
	}
}
