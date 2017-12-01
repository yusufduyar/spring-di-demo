package com.springfwcourse.didemo.springframework.controllers;

import com.springfwcourse.services.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private IGreetingService greetingService;

    public MyController(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return greetingService.sayGreeting();
    }
}
