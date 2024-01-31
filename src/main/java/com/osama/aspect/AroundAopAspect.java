package com.osama.aspect;


import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class AroundAopAspect {

    @Around("com.osama.aspect.CommonPointCut.TrackTimeForSpecificMethod()")
    public Object calculateTimeOfExecution(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // Start time of method
        long startTime = System.currentTimeMillis();

        //execute the method here
        Object returnValue = proceedingJoinPoint.proceed();

        // End time of method
        long endTime = System.currentTimeMillis();

        // Total time of execution
        long executionTime = startTime - endTime;
        log.info("Around Aspect {} execution time {} in ms" , proceedingJoinPoint, executionTime);

        return returnValue;


    }


}
