package com.battlecall.spring.aspectj.annotation;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void execute(){
        System.out.println("hello: "+this.getName());
    }
}
