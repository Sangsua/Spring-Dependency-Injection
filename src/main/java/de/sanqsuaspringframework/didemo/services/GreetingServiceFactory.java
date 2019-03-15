package de.sanqsuaspringframework.didemo.services;

import de.sanqsuaspringframework.didemo.repositories.GreetingRepository;

public class GreetingServiceFactory {
    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String language) {
        switch (language) {
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingService(greetingRepository);
            case "en":
                return new PrimaryEnglishGreetingService(greetingRepository);
            default:
                return new PrimaryEnglishGreetingService(greetingRepository);
        }

    }
}
