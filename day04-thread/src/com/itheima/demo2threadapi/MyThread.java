package com.itheima.demo2threadapi;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    public MyThread() {

    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子输出：" + i);
        }
    }
}
