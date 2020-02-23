package com.develop.projectmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectManagementApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/projectmanagement");
		SpringApplication.run(ProjectManagementApplication.class, args);
	}

}
