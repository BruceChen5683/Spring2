package com.battlecall.spring.cglib;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyProxyHandler implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("object o "+o.getClass().getName());


        for (int i = 0;i < objects.length;i++){
            System.out.println("args "+objects[i]);
        }

        Object object = methodProxy.invokeSuper(o,objects);
        System.out.println("object "+object);
        return object;
    }
}
