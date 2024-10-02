package com.itheima.demo6;

public class ThreadDmeo1 {
    public static void main(String[] args) {
        cashShare acc = new cashShare("1234", 100000);

        new DrawThread("小明", acc).start();
        new DrawThread("老师", acc).start();
    }

}
