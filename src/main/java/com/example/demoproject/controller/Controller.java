package com.example.demoproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1", produces = {MediaType.ALL_VALUE})
public class Controller {

    @GetMapping(value = "/hello", consumes = MediaType.ALL_VALUE)
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }

    @GetMapping(value = "/bye", consumes = MediaType.ALL_VALUE)
    public ResponseEntity<String> bye() {
        return new ResponseEntity<>("Bye!", HttpStatus.OK);
    }
}
