package com.battlecall.spring.aop;

import com.battlecall.spring.utils.MyTool;

public class AopTest {
    public static void main(String[] args) {
        Person person = (Person) MyTool.getFactory().getBean("person");
        person.eat();
    }
}
