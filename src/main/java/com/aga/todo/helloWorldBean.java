package com.aga.todo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class helloWorldBean {
    private String message;

    public helloWorldBean(String message) {
        this.message = message;
    }
}
