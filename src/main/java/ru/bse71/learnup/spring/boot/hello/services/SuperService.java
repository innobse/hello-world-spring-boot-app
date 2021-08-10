package ru.bse71.learnup.spring.boot.hello.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bse71.learnup.spring.boot.hello.config.Properties;

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
    public SuperService(Logger logger, Helper helper, Properties properties) {
        this.logger = logger;
        this.helper = helper;
        logger.log("SuperService created. Properties: " + properties);
    }

    public void doWork() {
        logger.log("I start work!");
        helper.help();
    }

}
