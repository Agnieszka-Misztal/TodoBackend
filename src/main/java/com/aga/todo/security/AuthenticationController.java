package com.aga.todo.security;


import com.aga.todo.helloWorldBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AuthenticationController {

    @GetMapping("/auth")
        public AuthenticationBasic helloWorldBeaan(){
            return  new AuthenticationBasic("Zaostałeś uwierzytelniony");
        }
    }
