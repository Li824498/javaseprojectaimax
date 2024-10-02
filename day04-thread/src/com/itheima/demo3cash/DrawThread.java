package com.itheima.demo3cash;

public class DrawThread extends Thread{
    private cashShare acc;


    public DrawThread(String name, cashShare acc){
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        acc.drawMoney(100000);
    }
}
