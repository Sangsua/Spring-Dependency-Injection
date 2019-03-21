package de.sanqsuaspringframework.didemo.config;

import de.sanqsuaspringframework.didemo.examplebeans.FakeDataSource;
import de.sanqsuaspringframework.didemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by jt on 6/7/17.
 */
@Configuration
public class PropertyConfig {

    @Value("${de.username}")
    String username;

    @Value("${de.password}")
    String password;

    @Value("${de.dburl}")
    String url;

    @Value("${de.jms.username}")
    String jmsName;

    @Value("${de.jms.password}")
    String jmsPassword;

    @Value("${de.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsName);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;

    }


}
