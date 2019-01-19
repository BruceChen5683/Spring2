package com.battlecall.spring;

public class American implements Person{
    @Override
    public void sayHi() {
        System.out.println("hello");
    }

    @Override
    public void sayBye() {
        System.out.println("bye bye");
    }
}
