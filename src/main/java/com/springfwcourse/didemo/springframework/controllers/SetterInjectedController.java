package com.springfwcourse.didemo.springframework.controllers;

import com.springfwcourse.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private IGreetingService greetingService;

   public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(@Qualifier("getterGreetingService") IGreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
