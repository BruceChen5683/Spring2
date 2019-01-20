package com.battlecall.spring.test5;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Chinese implements Person, InitializingBean, DisposableBean {
    private Tool tool;

    public Chinese() {
        System.out.println("Chinese.Chinese 实例构造方法");
    }

    public Tool getTool() {
        System.out.println("Chinese.getTool");
        return tool;
    }

    public void setTool(Tool tool) {
        System.out.println("Chinese.setTool");
        this.tool = tool;
    }

    @Override
    public void work() {
        System.out.println(this.tool.realWork());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Chinese.afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Chinese.destroy");
    }

    public void myInit(){
        System.out.println("Chinese.myInit");
    }

    public void myDestroy(){
        System.out.println("Chinese.myDestroy");
    }
}
