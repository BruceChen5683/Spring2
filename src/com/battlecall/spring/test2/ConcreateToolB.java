package com.battlecall.spring.test2;

public class ConcreateToolB implements Tool{
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void realWork() {
        System.out.println("from tool B "+name);
    }
}
