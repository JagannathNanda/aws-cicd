package com.expo.web;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HomeController {
    @GetMapping("/")
    public ResponseEntity<String> heartBeat() {
        return ResponseEntity.ok("App is running.");
    }

}
