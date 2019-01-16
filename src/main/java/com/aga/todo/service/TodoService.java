package com.aga.todo.service;

import com.aga.todo.domain.Todo;
import com.aga.todo.repository.TodoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoService {

private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    //testy
//    private static List<Todo> todos = new ArrayList();
//
//
//    static{
//        todos.add(Todo.builder().id(Long.valueOf(1)).username("zenek").description("upiec ciasteczka").targetDate(new Date()).isCompleted(false).build());
//        todos.add(Todo.builder().id(Long.valueOf(2)).username("Basia").description("nakarmic kota").targetDate(new Date()).isCompleted(false).build());
//        todos.add(Todo.builder().id(Long.valueOf(3)).username("ktos").description("kupic mleko").targetDate(new Date()).isCompleted(false).build());
//    }
//
//
//    public List<Todo> findAll(){
//        return todos;
//    }



    public Iterable<Todo> getAllTodos(){
        return todoRepository.findAll();
    }

    public Iterable<Todo> getAllUserTodos(String username){
        return todoRepository.findByUsername(username);
    }

    public Todo getTodo(Long id){
        return todoRepository.findById(id).get();
    }

    public void deleteTodo(Long id){
        todoRepository.deleteById(id);
    }



    public Todo save(Todo todo){
        return todoRepository.save(todo);
    }



}
