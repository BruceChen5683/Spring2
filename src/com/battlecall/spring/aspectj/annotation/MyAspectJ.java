package com.battlecall.spring.aspectj.annotation;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspectJ {

    @Pointcut("execution(public * execute(..)) && target(com.battlecall.spring.aspectj.annotation.Person)")
    public void pointcut(){

    }

    @Before("pointcut()")
    public void beforeExecute(JoinPoint joinPoint){
        System.out.println("MyAspectJ.beforeExecute");
    }

    @Around(value = "pointcut()")
    public Object myOperation(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("MyAspectJ.myOperation");
        return proceedingJoinPoint.proceed();
    }

    @After("pointcut()")
    public void afterExecute(JoinPoint joinPoint){
        System.out.println("MyAspectJ.afterExecute");
    }
}
