package de.sanqsuaspringframework.didemo.controllers;

import de.sanqsuaspringframework.didemo.services.IGreetingService;

//use Interface for typemigration
public class SetterInjectedController {
    private IGreetingService greetingService;


    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
