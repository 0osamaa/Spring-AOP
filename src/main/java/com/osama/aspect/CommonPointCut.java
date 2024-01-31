package com.osama.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCut {

    @Pointcut("execution(* com.osama.service.*.*(..))")
    public void businessAndDataConfig(){}

    @Pointcut("@annotation(com.osama.annotations.TrackTime)")
    public void TrackTimeForSpecificMethod(){}



}
