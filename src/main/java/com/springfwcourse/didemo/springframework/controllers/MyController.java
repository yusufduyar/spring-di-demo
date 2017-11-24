package com.springfwcourse.didemo.springframework.controllers;

import com.springfwcourse.didemo.springframework.services.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private IGreetingService asd;

    public MyController(IGreetingService greetingService) {
        this.asd = greetingService;
    }

    public String hello(){
        return asd.sayGreeting();
    }
}
