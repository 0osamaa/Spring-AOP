package com.osama.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class BeforeAopAspect {


    //What kind of method calls I would intercept
    //execution(* PACKAGE.*.*(..))
    //Weaving & Weaver
    @Before("com.osama.aspect.CommonPointCut.businessAndDataConfig()")
    public void before(JoinPoint joinPoint) {
        //Advice
        log.info(" before execution for {}", joinPoint);
    }
}