package com.aga.todo.testowanie;

import com.aga.todo.testowanie.helloWorldBean;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/hello-world-bean")
    public helloWorldBean helloWorldBeaan(){
        return  new helloWorldBean("Hello World yey!!");
    }

    @GetMapping("/hello-world-bean/param/{name}")
    public helloWorldBean helloWorldBeaanparam(@PathVariable String name){
        return  new helloWorldBean(String.format("Hello World yupi. %s ", name));
    }


}
