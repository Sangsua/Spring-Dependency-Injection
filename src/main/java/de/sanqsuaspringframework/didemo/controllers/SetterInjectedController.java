package de.sanqsuaspringframework.didemo.controllers;

import de.sanqsuaspringframework.didemo.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//use Interface for typemigration
//Dont USe this
@Controller
public class SetterInjectedController {
    @Autowired
    private IGreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
