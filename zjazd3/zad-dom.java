package com.example.homework.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeWorkController {
    @GetMapping("/path/{variable}")
    public ResponseEntity<String> getWithPathVariable(@PathVariable String variable) {
        return ResponseEntity.ok("Received PathVariable: " + variable);
    }

    @GetMapping("/param")
    public ResponseEntity<String> getWithRequestParam(@RequestParam String param) {
        return ResponseEntity.ok("Received RequestParam: " + param);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateWithPathVariable(
            @PathVariable Long id,
            @RequestBody Object requestBody) {
        
        return ResponseEntity.ok(requestBody);
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody Object requestBody) {
        return ResponseEntity.status(HttpStatus.CREATED).body(requestBody);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }
}
