package com.conceptandcoding.learningspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringbootapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootapplicationApplication.class, args);
//		System.out.println("hello world");
	}

}
