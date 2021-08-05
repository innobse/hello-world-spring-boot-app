package ru.bse71.learnup.spring.boot.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import ru.bse71.learnup.spring.boot.hello.config.MyConfig;
import ru.bse71.learnup.spring.boot.hello.services.SuperService;

/**
 * Description
 *
 * @author bse71
 * Created on 05.08.2021
 * @since
 */
@SpringBootApplication
@Import(MyConfig.class)
public class Application {

    public static void main(String[] args) {
        final ConfigurableApplicationContext ctx = SpringApplication.run(Application.class);
        ctx.getBean(SuperService.class).doWork();
    }


}
