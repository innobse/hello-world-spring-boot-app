package ru.bse71.learnup.spring.boot.hello.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.bse71.learnup.spring.boot.hello.annotations.ConsoleWorker;
import ru.bse71.learnup.spring.boot.hello.annotations.FileWorker;

/**
 * Description
 *
 * @author bse71
 * Created on 05.08.2021
 * @since
 */
@Service
public class SuperService {

    private Logger logger;
    private Helper helper;

    @Autowired
    public SuperService(@ConsoleWorker Logger logger, @ConsoleWorker Helper helper) {
        this.logger = logger;
        this.helper = helper;
    }

    public void doWork() {
        logger.log("I start work!");
        helper.help();
    }

}
