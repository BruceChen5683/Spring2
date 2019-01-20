package com.battlecall.spring.test2;

public class ConcreateToolA implements Tool{
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
        System.out.println("from Tool A "+name);
    }
}
