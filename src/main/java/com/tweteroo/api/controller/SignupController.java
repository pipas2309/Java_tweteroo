package com.tweteroo.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dto.UserDTO;

@RestController
@RequestMapping("/api")
public class SignupController {
    
    @CrossOrigin
    @PostMapping("/auth/sign-up")
    public ResponseEntity<String> create(@RequestBody UserDTO user) {
        return ResponseEntity.status(202).body("OK");
    } 
}
