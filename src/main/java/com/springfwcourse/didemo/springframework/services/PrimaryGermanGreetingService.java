package com.springfwcourse.didemo.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class PrimaryGermanGreetingService implements IGreetingService {

    private IGreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(IGreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
       return greetingRepository.getGermanGreeting();
    }
}
