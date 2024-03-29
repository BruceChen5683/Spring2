package com.battlecall.spring.cglib;


import net.sf.cglib.proxy.Enhancer;

public class CglibTest {
    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(Cat.class);
        MyProxyHandler proxyHandler = new MyProxyHandler();
        enhancer.setCallback(proxyHandler);

        Cat cat = (Cat) enhancer.create();
        cat.eat("haha");



        Cat cat1 = (Cat)(new CgLibProxy().getCgLibProxy(Cat.class));
        cat1.eat("--");

    }
}
