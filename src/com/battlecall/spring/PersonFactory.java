package com.battlecall.spring;

public class PersonFactory {

    public static Person getPerson(String name){
        if ("Chinese".equals(name)){
            return new Chinese();
        }else {
            return new American();
        }
    }
}
