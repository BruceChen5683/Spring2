package com.battlecall.spring.hibernate.impl;

import com.battlecall.spring.hibernate.dao.PersonDao;
import com.battlecall.spring.hibernate.model.Person;
import com.battlecall.spring.hibernate.service.PersonService;

import java.util.List;

public class PersonServiceImpl implements PersonService{
    private PersonDao personDao;

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public void save(Person person) {
        personDao.save(person);
    }

    @Override
    public void delete(int id) {
        personDao.delete(id);
    }

    @Override
    public Person getPersonById(int id) {
        return personDao.getPersonById(id);
    }

    @Override
    public List<Person> getPersonsByName(String name) {
        return personDao.getPersonsByName(name);
    }

    @Override
    public void update(Person person) {
        personDao.update(person);
    }
}
