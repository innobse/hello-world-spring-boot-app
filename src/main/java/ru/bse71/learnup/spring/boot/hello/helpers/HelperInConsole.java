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
@Profile("console")
public class HelperInConsole extends Helper {

    public HelperInConsole() {
        prefix = "Console";
    }

    @Override
    public void help() {
        super.help();
    }
}
