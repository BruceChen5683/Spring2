package com.battlecall.spring.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CgLibProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();


    public Object getCgLibProxy(Class<?> clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("CgLibProxy.intercept");


        methodProxy.invokeSuper(o,objects);


        return null;
    }
}
