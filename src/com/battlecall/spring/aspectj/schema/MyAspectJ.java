package com.battlecall.spring.aspectj.schema;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

public class MyAspectJ {


    public void beforeExecute(JoinPoint joinPoint){
        System.out.println("schema.beforeExecute");
    }

    public Object myOperation(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("schema.myOperation");
        return proceedingJoinPoint.proceed();
    }

    public void afterExecute(JoinPoint joinPoint){
        System.out.println("schema.afterExecute");
    }
}
