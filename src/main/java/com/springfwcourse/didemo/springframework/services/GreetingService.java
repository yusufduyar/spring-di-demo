package com.springfwcourse.didemo.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {

    public static final String HELLO_WORLD ="Hello World!";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
