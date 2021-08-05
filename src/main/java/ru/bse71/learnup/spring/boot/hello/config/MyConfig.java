package ru.bse71.learnup.spring.boot.hello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.bse71.learnup.spring.boot.hello.services.Logger;
import ru.bse71.learnup.spring.boot.hello.services.SuperService;

/**
 * Description
 *
 * @author bse71
 * Created on 05.08.2021
 * @since
 */
@Configuration
public class MyConfig {

    @Bean
    public Logger logger() {
        return new Logger();
    }

    @Bean
    public SuperService superService(Logger logger) {
        return new SuperService(logger);
    }
}
