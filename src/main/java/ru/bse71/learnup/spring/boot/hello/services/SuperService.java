package ru.bse71.learnup.spring.boot.hello.services;

/**
 * Description
 *
 * @author bse71
 * Created on 05.08.2021
 * @since
 */
public class SuperService {

    private Logger logger;

    public SuperService(Logger logger) {
        this.logger = logger;
    }

    public void doWork() {
        logger.log("I start work!");
    }

}
