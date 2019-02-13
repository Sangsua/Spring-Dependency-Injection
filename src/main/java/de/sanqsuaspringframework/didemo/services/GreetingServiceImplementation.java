package de.sanqsuaspringframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImplementation implements IGreetingService {
    public static final String HELLO_GUYS = "Original: Hello Guys";
    @Override
    public String sayGreeting() {
        return HELLO_GUYS;
    }
}
