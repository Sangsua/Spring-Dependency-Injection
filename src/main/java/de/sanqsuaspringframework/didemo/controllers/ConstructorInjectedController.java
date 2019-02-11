package de.sanqsuaspringframework.didemo.controllers;

import de.sanqsuaspringframework.didemo.services.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
//Use This
public class ConstructorInjectedController {

    private IGreetingService iGreetingService;

    public ConstructorInjectedController(IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    public String sayHello() {
        return iGreetingService.sayGreeting();
    }
}
