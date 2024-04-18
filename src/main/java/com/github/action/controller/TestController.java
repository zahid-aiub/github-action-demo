package com.github.action.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping(value = "test")
    public String test() {
        return "Github action working ...";
    }

    @GetMapping(value = "login")
    public String login() {

        int a = 10;
        return "Login action working ...";
    }

}
