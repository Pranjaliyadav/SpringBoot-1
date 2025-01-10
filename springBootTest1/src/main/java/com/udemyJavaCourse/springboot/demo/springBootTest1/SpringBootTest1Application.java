package com.udemyJavaCourse.springboot.demo.springBootTest1;
//defines the package name for this class. it's a part of the folder structure in my project.

import org.springframework.boot.SpringApplication;
//SprintApplication is a utility class that provides a way to bootstrap and launch a spring boot application from a java main method
import org.springframework.boot.autoconfigure.SpringBootApplication;

//SprintBootApplication - annotation that marks this class as the main configuration class and a spring boot application
@SpringBootApplication
public class SpringBootTest1Application {
	//main class declaration

	//main method is the entry point for java application
	public static void main(String[] args) {

		/*starts the spring application.run start spring application. performs following :
		- sets up spring applicationContext (dependency injection container)
		- starts embedded web server(like tomcat, if a web application)
		- scans the classpath for spring components and beans

		*/

		SpringApplication.run(SpringBootTest1Application.class, args);
	}

}
