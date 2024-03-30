package com.cspringstarthere.aspects;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.cspringstarthere.model.Comment;


@Component
@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    @Around("@annotation(com.cspringstarthere.annotations.ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        try {
            String methodName = joinPoint.getSignature().getName();
            Object[] arguments = joinPoint.getArgs();
            
            logger.info("Logging Aspect: Calling the intercepted method");
            
            Object returnedByMethod = joinPoint.proceed();

            logger.info("Logging Aspect: Method executed and returned " + returnedByMethod);
            
            return returnedByMethod;
        } catch (Throwable e) {
            return e;
        }
    }
}
