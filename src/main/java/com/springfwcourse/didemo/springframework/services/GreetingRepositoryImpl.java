package com.springfwcourse.didemo.springframework.services;

public class GreetingRepositoryImpl implements IGreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getTurkishGreeting() {
        return "Türkçe selamlama servisinden merhaba !";
    }

    @Override
    public String getGermanGreeting() {

        return "Primärer Grußdienst";

    }
}