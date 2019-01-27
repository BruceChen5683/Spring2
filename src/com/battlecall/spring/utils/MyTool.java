package com.battlecall.spring.utils;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MyTool {

    public static XmlBeanFactory getFactory(){
        ClassPathResource resource = new ClassPathResource("applicationContext.xml");

        return new XmlBeanFactory(resource);
    }
}
