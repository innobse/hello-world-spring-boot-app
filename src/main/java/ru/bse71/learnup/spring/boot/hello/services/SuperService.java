package ru.bse71.learnup.spring.boot.hello.services;

import ru.bse71.learnup.spring.boot.hello.annotations.Loggable;

/**
 * Description
 *
 * @author bse71
 * Created on 05.08.2021
 * @since
 */
public class SuperService {

    private static final int WORK_TIME = 3000;

    @Loggable
    public void doWork() {
        try {
            Thread.sleep(WORK_TIME);
//            throw new NullPointerException();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
