package ru.bse71.learnup.spring.boot.hello.loggers;

import org.springframework.stereotype.Component;
import ru.bse71.learnup.spring.boot.hello.annotations.ConsoleWorker;
import ru.bse71.learnup.spring.boot.hello.services.Logger;

/**
 * Description
 *
 * @author bse71
 * Created on 05.08.2021
 * @since
 */
@Component
@ConsoleWorker
public class ConsoleLogger extends Logger {

    public void log(Object o) {
        super.log("Console: " + o);
    }
}
