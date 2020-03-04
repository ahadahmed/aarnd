package com.spring.boot.demo.controllers;

import com.sun.corba.se.impl.orb.ParserTable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DummyController {
    private class Test {
        String greetings = "Hello";
        HttpStatus status = HttpStatus.OK;
    }

    @GetMapping("/test")
    public Map<String, String> test(){
        HashMap<String, String> response = new HashMap<>();
        response.put("greetings", "Hello");
        response.put("status", HttpStatus.OK.name());

        return response;
    }
}
