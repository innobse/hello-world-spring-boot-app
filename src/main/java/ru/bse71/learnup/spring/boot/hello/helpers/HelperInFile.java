package ru.bse71.learnup.spring.boot.hello.helpers;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import ru.bse71.learnup.spring.boot.hello.services.Helper;

/**
 * Description
 *
 * @author bse71
 * Created on 11.08.2021
 * @since
 */
@Component
@Profile("file")
public class HelperInFile extends Helper {

    public HelperInFile() {
        prefix = "File";
    }

    @Override
    public void help() {
        super.help();
    }
}
