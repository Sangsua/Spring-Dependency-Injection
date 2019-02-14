package de.sanqsuaspringframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Primärer deutscher Gruß : Hallo!";
    }
}
