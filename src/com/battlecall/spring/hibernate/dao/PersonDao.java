package com.battlecall.spring.hibernate.dao;

import com.battlecall.spring.hibernate.model.Person;

import java.util.List;

public interface PersonDao {

    public void save(Person person);

    public void delete(int id);

    public Person getPersonById(int id);

    public List<Person> getPersonsByName(String name);

    public void update(Person person);

    public List<Person> listAll();
}
