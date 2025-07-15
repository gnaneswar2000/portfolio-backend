package com.portfolio.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.portfolio.backend.entity.ContactForm;
import com.portfolio.backend.repository.ContactFormRepository;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactController {

    @Autowired
    private ContactFormRepository repository;

    @PostMapping
    public ResponseEntity<String> handleForm(@RequestBody ContactForm form) {
        repository.save(form);
        return ResponseEntity.ok("Saved successfully!");
    }
}
