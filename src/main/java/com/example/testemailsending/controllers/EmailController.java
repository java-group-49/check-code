package com.example.testemailsending.controllers;

import com.example.testemailsending.service.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    private final EmailServiceImpl emailService;

    @Autowired
    public EmailController(EmailServiceImpl emailService) {
        this.emailService = emailService;
    }

    @GetMapping("/send")
    public String send(){
        emailService.sendSimpleMessage();
        return "The email was sent";
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
