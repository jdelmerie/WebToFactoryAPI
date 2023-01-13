package com.webfactory.todo;

import com.webfactory.todo.entities.Todo;
import com.webfactory.todo.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

	@Autowired
	private TodoServiceImpl todoService;

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoService.save(new Todo(1L, "Write an article for my blog", "Will take about the year 1993", false));
		todoService.save(new Todo(2L, "Learn more about Angular", "NGRX", true));
		todoService.save(new Todo(3L, "Go to the doctor", "Need to take an appointment before",false));
	}
}
