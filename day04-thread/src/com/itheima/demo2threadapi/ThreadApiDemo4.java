package com.itheima.demo2threadapi;

public class ThreadApiDemo4 {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.setName("sss");
        t1.start();
        System.out.println(t1.getName());

        Thread t2 = new MyThread("test");
        t2.start();
        System.out.println(t2.getName());

        Thread m = Thread.currentThread();
        System.out.println(m.getName());

    }
}
