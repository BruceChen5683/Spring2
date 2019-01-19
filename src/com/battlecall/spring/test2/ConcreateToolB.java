package com.battlecall.spring.test2;

public class ConcreateToolB implements Tool{
    @Override
    public void realWork() {
        System.out.println("from tool B");
    }
}
