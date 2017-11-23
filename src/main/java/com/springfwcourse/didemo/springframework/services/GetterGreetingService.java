package com.springfwcourse.didemo.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
