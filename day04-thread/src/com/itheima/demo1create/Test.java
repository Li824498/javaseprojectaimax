package com.itheima.demo1create;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主县城输出" + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子输出：" + i);
        }
    }
}
