package de.sanqsuaspringframework.didemo;

import de.sanqsuaspringframework.didemo.controllers.ConstructorInjectedController;
import de.sanqsuaspringframework.didemo.controllers.MyController;
import de.sanqsuaspringframework.didemo.controllers.PropertyInjectedController;
import de.sanqsuaspringframework.didemo.controllers.SetterInjectedController;
import de.sanqsuaspringframework.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");
        FakeDataSource fakeDataSource =  ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());
    }

}

