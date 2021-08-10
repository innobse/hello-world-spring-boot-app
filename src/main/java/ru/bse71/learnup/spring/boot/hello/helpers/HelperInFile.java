package ru.bse71.learnup.spring.boot.hello.helpers;

import org.springframework.stereotype.Component;
import ru.bse71.learnup.spring.boot.hello.annotations.ConsoleWorker;
import ru.bse71.learnup.spring.boot.hello.annotations.FileWorker;
import ru.bse71.learnup.spring.boot.hello.services.Helper;

/**
 * Description
 *
 * @author bse71
 * Created on 11.08.2021
 * @since
 */
@Component
@FileWorker
public class HelperInFile extends Helper {

    public HelperInFile() {
        prefix = "File";
    }

    @Override
    public void help() {
        super.help();
    }
}
