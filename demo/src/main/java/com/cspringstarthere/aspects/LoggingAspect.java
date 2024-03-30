package com.cspringstarthere.aspects;

import java.util.Arrays;
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
    public Object log(ProceedingJoinPoint joinPoint) {
        try {
            String methodName = joinPoint.getSignature().getName();
            Object[] arguments = joinPoint.getArgs();
            
            logger.info("Method " + methodName + " with parameters " + Arrays.asList(arguments) + " will execute");
            Object returnedByMethod = joinPoint.proceed();
            logger.info("Method executed and returned " + returnedByMethod);
            
            return returnedByMethod;
        } catch (Throwable e) {
            return e;
        }
    }
}
