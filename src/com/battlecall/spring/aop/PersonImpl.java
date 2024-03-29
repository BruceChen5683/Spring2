package com.battlecall.spring.aop;

public class PersonImpl implements Person{
    private String name;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void eat() {
        System.out.println(this.name + "  eat");
    }

    @Override
    public void sleep() {
        System.out.println(this.name + "  sleep");
    }

    @Override
    public void study() {
        System.out.println(this.name + "  in the "+this.address+",study");
    }
}
