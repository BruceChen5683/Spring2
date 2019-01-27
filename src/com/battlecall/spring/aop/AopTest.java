package com.battlecall.spring.aop;

import com.battlecall.spring.utils.MyTool;

public class AopTest {
    public static void main(String[] args) {
        Person person = (Person) MyTool.getFactory().getBean("person");

        System.out.println("person "+person.getClass().getName());
        person.eat();
        person.study();
    }
}
