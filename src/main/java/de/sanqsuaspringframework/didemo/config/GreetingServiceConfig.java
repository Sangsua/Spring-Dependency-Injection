package de.sanqsuaspringframework.didemo.config;

import de.sanqsuaspringframework.didemo.repositories.GreetingRepository;
import de.sanqsuaspringframework.didemo.services.GreetingService;
import de.sanqsuaspringframework.didemo.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

//@Configuration
//public class GreetingServiceConfig {
//@Bean
//GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
//    return  new GreetingServiceFactory(greetingRepository);
//}
//
//@Bean
//@Primary
//@Profile({"en","default"})
//    GreetingService primaryEnglishGreetingService(GreetingServiceFactory greetingServiceFactory){
//    return greetingServiceFactory.createGreetingService("en");
//}
//@Bean
//    @Primary
//    @Profile("de")
//    GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
//    return greetingServiceFactory.createGreetingService("de");
//}
//    @Bean
//    @Primary
//    @Profile("de")
//    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
//    return greetingServiceFactory.createGreetingService("es");
//}
//}
