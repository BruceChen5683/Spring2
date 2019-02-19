package com.battlecall.spring.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest2 {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext3.xml");

        Person person = (Person) context.getBean("personAspectj");
        person.execute();
    }
}
