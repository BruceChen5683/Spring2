package com.battlecall.spring.manager;

public class OperationImpl implements Operation{
    private OperationService service;

    public void setService(OperationService service) {
        this.service = service;
    }

    @Override
    public void update() {
        this.service.update();;
    }

    @Override
    public void view() {
        this.service.view();
    }
}
