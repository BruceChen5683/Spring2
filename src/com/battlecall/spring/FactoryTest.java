package com.battlecall.spring;

public class FactoryTest {

    public static void main(String[] args) {
        Person person1 = PersonFactory.getPerson("Chinese");
        person1.sayHi();

        Person person2 = PersonFactory.getPerson("American");
        person2.sayHi();
    }
}
