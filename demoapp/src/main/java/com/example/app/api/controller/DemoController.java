package com.example.app.api.controller;

import com.example.app.api.model.Sentence;
import com.example.app.api.service.impl.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/endPoint")
public class DemoController {
    @Autowired
    private DemoServiceImpl service;

    @GetMapping("/demo")
    public String demoFunction(@RequestBody Sentence sentence) throws IOException {
        return service.demoFunction(sentence);
    }
}
