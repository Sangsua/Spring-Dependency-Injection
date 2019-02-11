package de.sanqsuaspringframework.didemo.controllers;

import de.sanqsuaspringframework.didemo.services.GreetingServiceImplementation;


//Dont do this
public class PropertyInjectedController {
    public GreetingServiceImplementation greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
