package ru.bse71.learnup.spring.boot.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import ru.bse71.learnup.spring.boot.hello.aspets.Logger;
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
        final SuperService service = ctx.getBean(SuperService.class);
        service.doWork();
//        ctx.registerShutdownHook();

    }

    @Bean
    public SuperService superService() {
        return new SuperService();
    }

    @Bean
    public Logger logger() {
        return new Logger();
    }


}
