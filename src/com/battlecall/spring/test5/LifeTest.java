package com.battlecall.spring.test5;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class LifeTest {

    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("WEB-INF/applicationContext.xml");

        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);

        Person person = (Person) xmlBeanFactory.getBean("life_chinese");

        person.work();

        xmlBeanFactory.destroySingleton("life_chinese");
    }



}
