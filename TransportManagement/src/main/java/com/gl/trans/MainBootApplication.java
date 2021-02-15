package com.gl.trans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan (basePackages = {"com.gl"})
public class MainBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainBootApplication.class, args);
	}
}
