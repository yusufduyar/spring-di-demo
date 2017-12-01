package com.springfwcourse.didemo.springframework.services;

public class GreetingServiceFactory {

    private IGreetingRepository greetingRepository;

    public GreetingServiceFactory(IGreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public IGreetingService createGreetingService(String lang){
        switch (lang){
            case "en": return new PrimaryGreetingService(greetingRepository);
            case "de": return new PrimaryGermanGreetingService(greetingRepository);
            case "tr": return new PrimaryTurkishGreetingService(greetingRepository);
            default: return new PrimaryGreetingService(greetingRepository);
        }
    }
}
