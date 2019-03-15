package de.sanqsuaspringframework.didemo.controllers_test;

import de.sanqsuaspringframework.didemo.controllers.SetterInjectedController;
import de.sanqsuaspringframework.didemo.services.GreetingServiceImplementation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectionControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImplementation());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImplementation.HELLO_GUYS, setterInjectedController.sayHello());
    }
}
