package com.battlecall.spring;

public class Chinese implements Person{
    @Override
    public void sayHi() {
        System.out.println("你好");
    }

    @Override
    public void sayBye() {
        System.out.println("再见");
    }
}
