package com.battlecall.spring.timer;

import com.battlecall.spring.hibernate.service.PersonService;
import com.battlecall.spring.utils.MyTool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TimerTest {
    public static void main(String[] args) throws InterruptedException {
//         MyTool.getFactory();
            new ClassPathXmlApplicationContext("applicationContext3.xml");
            Thread.sleep(500000);
    }
}
