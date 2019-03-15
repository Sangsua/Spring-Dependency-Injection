package de.sanqsuaspringframework.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    public LifeCycleDemoBean() {
        System.out.println("##I'm in the LifecycleBean constructor ");
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("##setBeanFactory: Been Factory has been set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("##setBeanName: Bean name has been set" + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("##Destroy: LifecycleBean has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("##afterPropertiesSet: LifeCycleBean properties have been set");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("##setApplicationContext: Applicationcontext has been set");
    }

    //______________________________________________________________________________________________________________________
  /*
  Annotations to acces the lifecycle
   */
    @PostConstruct
    public void postConstruct() {
        System.out.println("##The postconstruct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("##The preDestroy annotated method has been called");

    }

    public void beforeInit() {
        System.out.println("##The Before Init - Called by Bean Post Processor");

    }

    public void afterInit() {
        System.out.println("##After Init - Called by Bean Post processor");
    }
}
