package com.battlecall.spring.manager;

public class OperationServiceImpl implements OperationService{
    @Override
    public void update() {
        System.out.println("Update");//业务逻辑
    }

    @Override
    public void view() {
        System.out.println("View");//业务逻辑
    }
}
