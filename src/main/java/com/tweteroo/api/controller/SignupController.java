package com.tweteroo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dto.UserDTO;
import com.tweteroo.api.model.UserModel;
import com.tweteroo.api.repository.UserRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class SignupController {
    
    @Autowired
    private UserRepository repository;

    @CrossOrigin
    @PostMapping("/auth/sign-up")
    public ResponseEntity<String> create(@Valid @RequestBody UserDTO user) {

        repository.save(new UserModel(user));

        return ResponseEntity.status(201).body("OK");
    } 
}
