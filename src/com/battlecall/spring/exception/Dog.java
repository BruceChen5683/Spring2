package com.battlecall.spring.exception;

import java.sql.SQLException;

public class Dog {

    public void remove(){
        throw new RuntimeException("抛出运行时异常");
    }

    public void save() throws SQLException{
        throw new SQLException("抛出数据异常");
    }
}
