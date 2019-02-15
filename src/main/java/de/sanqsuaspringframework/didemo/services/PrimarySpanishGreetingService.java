package de.sanqsuaspringframework.didemo.services;

import de.sanqsuaspringframework.didemo.repositories.IPrimaryGreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements IGreetingService {

    IPrimaryGreetingRepository iPrimaryGreetingRepository;

    public PrimarySpanishGreetingService(IPrimaryGreetingRepository iPrimaryGreetingRepository) {
        this.iPrimaryGreetingRepository = iPrimaryGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return iPrimaryGreetingRepository.getSpanishGreeting();
    }
}
