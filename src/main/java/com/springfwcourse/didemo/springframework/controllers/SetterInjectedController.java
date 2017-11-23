package com.springfwcourse.didemo.springframework.controllers;

import com.springfwcourse.didemo.springframework.services.IGreetingService;

public class SetterInjectedController {
    private IGreetingService greetingService;

   public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
