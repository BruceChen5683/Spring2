package com.battlecall.spring.hibernate.service;

import com.battlecall.spring.hibernate.model.Person;

import java.util.List;

public interface PersonService {
    public void save(Person person);

    public void delete(int id);

    public Person getPersonById(int id);

    public List<Person> getPersonsByName(String name);

    public List<Person> listAll();

    public void update(Person person);
}
