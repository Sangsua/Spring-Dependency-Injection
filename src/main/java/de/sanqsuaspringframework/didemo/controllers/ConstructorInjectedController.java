package de.sanqsuaspringframework.didemo.controllers;

import de.sanqsuaspringframework.didemo.services.IGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;

public class ConstructorInjectedController {
    private IGreetingService iGreetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    public String sayHello() {
        return iGreetingService.sayGreeting();
    }
}
