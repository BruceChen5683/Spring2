package com.battlecall.spring.action;

import com.battlecall.spring.hibernate.service.PersonService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class ListPerson extends ActionSupport {

    private PersonService service;

    public PersonService getService() {
        return service;
    }

    public void setService(PersonService service) {
        this.service = service;
    }

    @Override
    public String execute() throws Exception {
        Map request = (Map) ActionContext.getContext().get("request");
        request.put("list",this.service.listAll());

        return super.execute();
    }
}
