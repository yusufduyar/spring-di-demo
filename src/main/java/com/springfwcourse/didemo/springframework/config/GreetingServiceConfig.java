package com.springfwcourse.didemo.springframework.config;

import com.springfwcourse.didemo.springframework.services.GreetingServiceFactory;
import com.springfwcourse.didemo.springframework.services.IGreetingRepository;
import com.springfwcourse.didemo.springframework.services.IGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(IGreetingRepository greetingRepository){
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"default","en"})
    IGreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("de")
    IGreetingService germanGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("de");
    }

    @Bean
    @Primary
    @Profile("tr")
    IGreetingService turkishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("tr");
    }
}
