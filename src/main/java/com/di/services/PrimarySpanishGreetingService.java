package com.di.services;

public class PrimarySpanishGreetingService implements GreetingService {

    private final GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(final GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
