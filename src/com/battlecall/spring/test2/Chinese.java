package com.battlecall.spring.test2;

public class Chinese implements Person {

    private Tool tool;

//    public Chinese(MyTool tool) {
//        this.tool = tool;
//    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    @Override
    public void work() {
        tool.realWork();
    }
}
