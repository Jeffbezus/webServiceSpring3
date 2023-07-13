package com.oliveira.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oliveira.project.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @GetMapping
    private ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria", "Maria@123", "85858585", "12344");
        return ResponseEntity.ok().body(u);
    }
}
