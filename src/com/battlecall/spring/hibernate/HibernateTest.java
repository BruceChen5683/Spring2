package com.battlecall.spring.hibernate;

import com.battlecall.spring.hibernate.model.Person;
import com.battlecall.spring.hibernate.service.PersonService;
import com.battlecall.spring.utils.MyTool;

public class HibernateTest {

    public static void main(String[] args) {
        PersonService personService = (PersonService) MyTool.getFactory().getBean("personService");

        Person person = new Person();
        person.setAge(2);
        person.setName("cjl");
        personService.save(person);
    }
}
