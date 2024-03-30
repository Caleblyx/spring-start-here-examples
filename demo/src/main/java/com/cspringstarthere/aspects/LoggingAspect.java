package com.cspringstarthere.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    @Around("execution(* com.cspringstarthere.services.CommentService.*(..))")
    public void log(ProceedingJoinPoint joinPoint) {
        try {
            logger.info("Method will execute");
            joinPoint.proceed();
            logger.info("Method executed");
        } catch (Throwable e) {
            logger.info(e.toString());
        } finally {

        }
    }
}
