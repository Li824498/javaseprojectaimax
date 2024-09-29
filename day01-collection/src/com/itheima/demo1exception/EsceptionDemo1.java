package com.itheima.demo1exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class EsceptionDemo1 {
    public static void main(String[] args) throws ParseException {
//        test();
        test2();
        try {
            test3();
        } catch (ArithmeticException e){
            System.out.println("异常");

        }
    }

    private static void test3() {
        System.out.println(10 / 0);

    }

    private static void test2() throws ParseException {
        String str = "2024-07-09 11:12:13";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf);
    }

    private static void test() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);
    }
}
