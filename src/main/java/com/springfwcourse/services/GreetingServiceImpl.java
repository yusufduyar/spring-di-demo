package com.springfwcourse.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements IGreetingService {

    public static final String HELLO_WORLD ="Hello from the implementation";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
