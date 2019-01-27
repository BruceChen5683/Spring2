package com.battlecall.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyArroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {


        System.out.println("arround "+methodInvocation.getMethod().getName());

        Object object = methodInvocation.proceed();

        System.out.println("invoke执行完毕");

        return object;
    }
}
