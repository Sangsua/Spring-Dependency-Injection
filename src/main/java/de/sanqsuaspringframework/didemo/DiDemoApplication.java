package de.sanqsuaspringframework.didemo;

import de.sanqsuaspringframework.didemo.controllers.ConstructorInjectedController;
import de.sanqsuaspringframework.didemo.controllers.MyController;
import de.sanqsuaspringframework.didemo.controllers.PropertyInjectedController;
import de.sanqsuaspringframework.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

     ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

    MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.sayhello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
    }

}

