package com.sync.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableAutoConfiguration
@SpringBootApplication
public class MobileSyncApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileSyncApplication.class, args);
	}

}
