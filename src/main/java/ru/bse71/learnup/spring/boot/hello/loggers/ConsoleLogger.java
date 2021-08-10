package ru.bse71.learnup.spring.boot.hello.loggers;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import ru.bse71.learnup.spring.boot.hello.services.Logger;

/**
 * Description
 *
 * @author bse71
 * Created on 05.08.2021
 * @since
 */
@Component
@Profile("console")
public class ConsoleLogger extends Logger {

    public void log(Object o) {
        super.log("Console: " + o);
    }
}
