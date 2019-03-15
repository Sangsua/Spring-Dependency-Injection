package de.sanqsuaspringframework.didemo.controllers_test;

import de.sanqsuaspringframework.didemo.controllers.ConstructorInjectedController;
import de.sanqsuaspringframework.didemo.services.GreetingServiceImplementation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectionControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImplementation());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImplementation.HELLO_GUYS, constructorInjectedController.sayHello());
    }
}
