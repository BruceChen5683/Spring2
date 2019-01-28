package com.battlecall.spring.manager;

import com.battlecall.spring.utils.MyTool;

public class ManagerTest {
    public static void main(String[] args) {
        Operation operation = (Operation) MyTool.getFactory().getBean("operation");

        operation.update();

        operation.view();
    }
}
