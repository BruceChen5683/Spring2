package com.battlecall.spring.test5;

public class ConcreateTool implements Tool{

    public ConcreateTool(){
        System.out.println("ConcreteaTool 实例化");
    }
    @Override
    public String realWork() {
        return "realWork is invoked";
    }
}
