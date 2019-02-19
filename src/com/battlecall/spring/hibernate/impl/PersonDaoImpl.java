package com.battlecall.spring.hibernate.impl;

import com.battlecall.spring.hibernate.dao.PersonDao;
import com.battlecall.spring.hibernate.model.Person;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class PersonDaoImpl extends HibernateDaoSupport implements PersonDao {
    @Override
    public void save(Person person) {
        this.getHibernateTemplate().save(person);
    }

    @Override
    public void delete(int id) {
        Person person = this.getHibernateTemplate().get(Person.class,id);
        this.getHibernateTemplate().delete(person);
    }

    @Override
    public Person getPersonById(int id) {
        return this.getHibernateTemplate().get(Person.class,id);
    }


    @SuppressWarnings("unchecked")
    @Override
    public List<Person> getPersonsByName(String name) {

        return (List<Person>) this.getHibernateTemplate().find("from Person p where p.name like ?","%"+name+"%");

    }

    @Override
    public void update(Person person) {
        this.getHibernateTemplate().saveOrUpdate(person);
    }

    @Override
    public List<Person> listAll() {
        return this.getHibernateTemplate().loadAll(Person.class);
    }
}
