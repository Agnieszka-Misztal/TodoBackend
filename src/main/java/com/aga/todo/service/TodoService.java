package com.aga.todo.service;

import com.aga.todo.domain.Todo;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoService {



    private static List<Todo> todos = new ArrayList();


    static{
        todos.add(Todo.builder().id(1).username("zenek").description("upiec ciasteczka").targetDate(new Date()).isCompleted(false).build());
        todos.add(Todo.builder().id(1).username("Basia").description("nakarmic kota").targetDate(new Date()).isCompleted(false).build());
        todos.add(Todo.builder().id(1).username("ktos").description("kupic mleko").targetDate(new Date()).isCompleted(false).build());
    }

    public List<Todo> findAll(){
        return todos;
    }
}
