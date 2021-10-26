package com.austassignment.taskmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.austassignment.taskmanagementsystem.TaskApp;

@SpringBootApplication
@EnableJpaRepositories
public class TaskApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(TaskApp.class, args);
		System.out.println("Application is started successfully");
	}

}
