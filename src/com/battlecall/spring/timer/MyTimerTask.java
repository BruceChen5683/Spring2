package com.battlecall.spring.timer;

import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("my timer task executed");

        try {
            System.out.println("go into try block");
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
