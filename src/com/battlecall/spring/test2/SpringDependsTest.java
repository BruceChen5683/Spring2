package com.battlecall.spring.test2;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SpringDependsTest {
    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("applicationContext.xml");
        XmlBeanFactory factory = new XmlBeanFactory(resource);
        Person person = (Person) factory.getBean("chinese2");
        person.work();
    }
}
