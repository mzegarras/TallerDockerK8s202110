package com.odybank.customers.controller;


import com.odybank.customers.config.MailProperties;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomersApi {

    private final MailProperties mailProperties;

    @GetMapping()
    public HttpEntity<String> demo(){

        return ResponseEntity.ok(mailProperties.getServer());

    }
}
