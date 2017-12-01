package com.springfwcourse.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("tr")
@Primary
public class PrimaryTurkishGreetingService implements IGreetingService {

    private IGreetingRepository greetingRepository;

    public PrimaryTurkishGreetingService(IGreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getTurkishGreeting();
    }
}
