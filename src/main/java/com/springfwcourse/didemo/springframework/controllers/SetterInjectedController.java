package com.springfwcourse.didemo.springframework.controllers;

import com.springfwcourse.didemo.springframework.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private IGreetingService greetingService;

   public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
