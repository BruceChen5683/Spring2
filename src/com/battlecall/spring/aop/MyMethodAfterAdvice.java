package com.battlecall.spring.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class MyMethodAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("in method after");

        System.out.println("returnValue = [" + o + "], method = [" + method + "], objects = [" + objects + "], o1 = [" + o1 + "]");
    }
}
