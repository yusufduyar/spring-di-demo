package com.springfwcourse.controllers;

import com.springfwcourse.didemo.springframework.controllers.PropertyInjectedController;
import com.springfwcourse.didemo.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_WORLD, propertyInjectedController.sayHello());
    }
}
