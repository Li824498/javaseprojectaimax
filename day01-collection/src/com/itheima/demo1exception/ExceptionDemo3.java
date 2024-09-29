package com.itheima.demo1exception;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        try {
            show(300);
        } catch (itheimaAgeIllegalException e) {
            e.printStackTrace();
        }

    }

    public static void show(int age) throws itheimaAgeIllegalException{
        if(age < 1 || age > 200) {
            throw new itheimaAgeIllegalException("出现异常");
        } else {
            System.out.println("OK");
        }
    }
}
