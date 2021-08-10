package ru.bse71.learnup.spring.boot.hello.aspets;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Description
 *
 * @author bse71
 * Created on 05.08.2021
 * @since
 */
@Aspect
public class Logger {

    @Pointcut("@annotation(ru.bse71.learnup.spring.boot.hello.annotations.Loggable)")
    public void log() {}

    @Around("log()")
    public void around(ProceedingJoinPoint point) throws Throwable {
        log("Start exec " + point.getSignature().getName() + "()");
        point.proceed();
        log("Start exec " + point.getSignature().getName() + "()");
    }

    @AfterReturning("log()")
    public void afterReturning(JoinPoint point) {
        log("After returning " + point.getSignature().getName() + "()");
    }

    @AfterThrowing("log()")
    public void afterThrowing(JoinPoint point) {
        log("After exception in " + point.getSignature().getName() + "()");
    }

    @Before("log()")
    public void before(JoinPoint point) {
        log("Before exec " + point.getSignature().getName() + "()");
    }

    private void log(Object o) {
        System.out.println(o);
    }
}
