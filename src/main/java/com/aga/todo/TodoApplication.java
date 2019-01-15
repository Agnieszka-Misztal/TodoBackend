package com.aga.todo;

import com.aga.todo.domain.Todo;
import com.aga.todo.repository.TodoRepository;
import com.aga.todo.service.TodoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);



	}

}

