package ru.bse71.learnup.spring.boot.hello.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Autowired
    public SuperService(Logger logger) {
        this.logger = logger;
    }

    public void doWork() {
        logger.log("I start work!");
    }

}
