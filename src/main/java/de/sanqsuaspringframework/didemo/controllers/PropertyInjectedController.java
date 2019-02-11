package de.sanqsuaspringframework.didemo.controllers;

import de.sanqsuaspringframework.didemo.services.GreetingServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


//Dont do this
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImplementation greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
