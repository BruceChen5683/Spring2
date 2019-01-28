package com.battlecall.spring.manager;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class AuthInterceptor implements MethodInterceptor {
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {


        String methodName = methodInvocation.getMethod().getName();

        if (!"admin".equals(username) && !"user".equals(username)){
            System.out.println("无权限操作");
            return null;
        }else if ("user".equals(username) && "update".equals(methodName)){
            System.out.println("普通用户无法执行更新操作");
            return null;
        }else {
            return methodInvocation.proceed();
        }

    }
}
