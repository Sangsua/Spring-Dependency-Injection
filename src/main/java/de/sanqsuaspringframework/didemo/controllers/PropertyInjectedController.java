package de.sanqsuaspringframework.didemo.controllers;

import de.sanqsuaspringframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


//Dont do this
@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("greetingServiceImplementation")
    public GreetingService greetingService;


    public String sayHello() {
        return "Injected Via Property" + greetingService.sayGreeting();
    }
}
