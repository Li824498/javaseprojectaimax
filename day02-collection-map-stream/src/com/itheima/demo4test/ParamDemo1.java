package com.itheima.demo4test;

public class ParamDemo1 {
    public static void main(String[] args) {
        sum();
        sum(10);
        sum(10,20,30);
        sum(new int[]{11, 22, 33, 44});

    }

    private static void sum(int...nums) {
    }
}
