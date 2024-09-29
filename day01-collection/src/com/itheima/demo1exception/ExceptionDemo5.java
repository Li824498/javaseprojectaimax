package com.itheima.demo1exception;

import java.util.Scanner;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println(test());
                break;
            } catch (Exception e) {
//                throw new RuntimeException(e);
                e.printStackTrace();
            }
        }
    }

    public static double test() throws Exception{
        System.out.println("请输入：");
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        return price;
    }
}
