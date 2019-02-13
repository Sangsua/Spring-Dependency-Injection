package de.sanqsuaspringframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Injected Via Setter Hello!";
    }
}
