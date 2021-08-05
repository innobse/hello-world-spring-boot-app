package ru.bse71.learnup.spring.boot.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import ru.bse71.learnup.spring.boot.hello.services.Logger;
import ru.bse71.learnup.spring.boot.hello.services.SuperService;

/**
 * Description
 *
 * @author bse71
 * Created on 05.08.2021
 * @since
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        final ConfigurableApplicationContext ctx = SpringApplication.run(Application.class);
        ctx.getBean(SuperService.class).doWork();
    }

    @Bean
    public Logger logger() {
        return new Logger();
    }

    @Bean
    public SuperService superService(Logger logger) {
        return new SuperService(logger);
    }


}
