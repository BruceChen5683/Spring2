package com.battlecall.spring.action;

import com.battlecall.spring.hibernate.service.PersonService;
import com.opensymphony.xwork2.ActionSupport;
import com.battlecall.spring.hibernate.model.Person;

public class SavePerson extends ActionSupport {
    private PersonService service;

    private Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public PersonService getService() {
        return service;
    }

    public void setService(PersonService service) {
        this.service = service;
    }

    @Override
    public String execute() throws Exception {

        this.service.save(person);

        return SUCCESS;
    }
}
