package com.battlecall.spring.test3;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {
    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("WEB-INF/applicationContext.xml");

        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);

        Person person = (Person) xmlBeanFactory.getBean("chinese3");
        person.test();
    }
}
