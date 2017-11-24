package com.springfwcourse.didemo.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hallo vom deutschen Grußdienst.";
    }
}
