package de.sanqsuaspringframework.didemo.controllers_test;

import de.sanqsuaspringframework.didemo.controllers.PropertyInjectedController;
import de.sanqsuaspringframework.didemo.services.GreetingServiceImplementation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImplementation();
    }

    @Test
    public void greetingTest() throws Exception {
        assertEquals(GreetingServiceImplementation.HELLO_GUYS, propertyInjectedController.sayHello());
    }

}
