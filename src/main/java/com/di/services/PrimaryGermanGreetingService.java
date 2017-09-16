package com.di.services;

public class PrimaryGermanGreetingService implements GreetingService {

    private final GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(final GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
