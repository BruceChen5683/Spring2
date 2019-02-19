package com.battlecall.spring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("WEB-INF/applicationContext.xml");

        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);

        Person person = (Person) xmlBeanFactory.getBean("american");
        person.sayHi();

        person = (Person) xmlBeanFactory.getBean("chinese");
        person.sayHi();



    }
}
