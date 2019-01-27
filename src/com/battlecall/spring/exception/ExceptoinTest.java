package com.battlecall.spring.exception;

import com.battlecall.spring.utils.MyTool;

import java.sql.SQLException;

public class ExceptoinTest {
    public static void main(String[] args) {
        Dog dog = (Dog) MyTool.getFactory().getBean("dog2");


        System.out.println("dog is "+dog.getClass().getName());

        try {
            dog.remove();
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("***********************");

        try {
            dog.save();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
