package com.osama.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class AfterAopAspect {

    @After("com.osama.aspect.CommonPointCut.businessAndDataConfig()")
    public void after(JoinPoint joinPoint) {
        log.info("after execution of {}", joinPoint);
    }
    @AfterThrowing(
            pointcut= "com.osama.aspect.CommonPointCut.businessAndDataConfig()",
            throwing = "exception")
    public void afterException(JoinPoint joinPoint , Exception exception) {
        log.info("after exception of - {} has thrown exception {}", joinPoint,exception);
    }
    @AfterReturning(
            pointcut= "com.osama.aspect.CommonPointCut.businessAndDataConfig()",
            returning = "resultValue")
    public void afterReturning(JoinPoint joinPoint , Object resultValue) {
        log.info("after execution of - {} has return the Object {}", joinPoint,resultValue);
    }
}
