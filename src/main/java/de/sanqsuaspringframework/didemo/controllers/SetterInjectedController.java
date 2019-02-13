package de.sanqsuaspringframework.didemo.controllers;

import de.sanqsuaspringframework.didemo.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//use Interface for typemigration
public class SetterInjectedController {
    private IGreetingService greetingService;


    public String sayHello() {
        return greetingService.sayGreeting();
    }

    @Autowired

    public void setGreetingService(@Qualifier("setterGreetingService") IGreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
