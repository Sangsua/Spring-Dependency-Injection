package de.sanqsuaspringframework.didemo.controllers;

import de.sanqsuaspringframework.didemo.services.IGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    IGreetingService iGreetingService;
    public MyController(@Qualifier("primarySpanishGreetingService") IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    public String sayHello(){
       System.out.println("MyController: First Hello");
        return iGreetingService.sayGreeting();
    }
}
