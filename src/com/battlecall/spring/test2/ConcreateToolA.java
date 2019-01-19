package com.battlecall.spring.test2;

public class ConcreateToolA implements Tool{
    @Override
    public void realWork() {
        System.out.println("from Tool A");
    }
}
