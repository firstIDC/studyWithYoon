package com.firstlab.study.controller;

import org.springframework.web.bind.annotation.GetMapping;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/")
    public String get() {
        return "Get Called!!";
    }

    @GetMapping("/name")
    public String name() {
        return "harugi";
    }

    @GetMapping("/age")
    public String age() {
        return "4";
    }
}
