package de.sanqsuaspringframework.didemo.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getGermanGreeting() {
        return "Deutscher Gruß: Hallo";
    }

    @Override
    public String getEnglishGreeting() {
        return "English Greeting: Hello";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }
}
