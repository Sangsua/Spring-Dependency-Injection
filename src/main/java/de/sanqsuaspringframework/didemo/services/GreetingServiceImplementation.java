package de.sanqsuaspringframework.didemo.services;


public class GreetingServiceImplementation implements IGreetingService {
    public static final String HELLO_GUYS = "Hello Guys";
    @Override
    public String sayGreeting() {
        return HELLO_GUYS;
    }
}
