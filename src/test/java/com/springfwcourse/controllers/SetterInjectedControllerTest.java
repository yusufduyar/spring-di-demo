package com.springfwcourse.controllers;

import com.springfwcourse.didemo.springframework.controllers.SetterInjectedController;
import com.springfwcourse.didemo.springframework.services.GreetingService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception{
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingService());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingService.HELLO_WORLD,setterInjectedController.sayHello());
    }
}
