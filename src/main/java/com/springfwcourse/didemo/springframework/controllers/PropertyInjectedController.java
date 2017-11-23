package com.springfwcourse.didemo.springframework.controllers;

import com.springfwcourse.didemo.springframework.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
