package com.aga.todo.controller;


import com.aga.todo.domain.Todo;
import com.aga.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/users/{username}/todos")
    public Iterable<Todo> getAllTodos(@PathVariable String username){
        return todoService.getAllUserTodos(username);

    }

    @DeleteMapping("/users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable long id){
        todoService.deleteTodo(id);
        return ResponseEntity.noContent().build();
    }


}
