package com.springfwcourse.didemo.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("tr")
@Primary
public class PrimaryTurkishGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Türkçe selamlama servisinden merhaba :)";
    }
}
