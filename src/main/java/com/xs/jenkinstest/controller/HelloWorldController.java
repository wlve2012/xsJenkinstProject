package com.xs.jenkinstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins")
public class HelloWorldController {
    @GetMapping("hello")
    public String get(){
        return "finally success my friend";
    }
}
