package ru.bse71.learnup.spring.boot.hello.services;

import org.springframework.stereotype.Component;

/**
 * Description
 *
 * @author bse71
 * Created on 05.08.2021
 * @since
 */
@Component
public class Logger {

    public void log(Object o) {
        System.out.println(o);
    }
}
