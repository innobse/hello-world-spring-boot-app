package ru.bse71.learnup.spring.boot.hello.annotations;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Description
 *
 * @author bse71
 * Created on 11.08.2021
 * @since
 */
@Qualifier("file-worker")
@Retention(RUNTIME)
@Target({METHOD, FIELD, PARAMETER, TYPE})
public @interface FileWorker {
}
