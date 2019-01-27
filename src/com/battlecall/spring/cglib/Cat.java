package com.battlecall.spring.cglib;

public class Cat {
    public String eat(String arg){
        System.out.println("eat");

        return arg+"_returenValue";
    }
}
