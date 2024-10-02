package com.itheima.demo1create;

public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        Thread t1 = new Thread(r);
        t1.start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("子2输出：" + i);
            }
        }).start();


        for (int i = 0; i < 5; i++) {
            System.out.println("zhu输出：" + i);
            if(i == 1){
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子输出：" + i);
        }
    }
}
