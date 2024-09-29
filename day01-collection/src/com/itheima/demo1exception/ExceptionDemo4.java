package com.itheima.demo1exception;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        show(300);

    }

    public static void show(int age) throws itheimaAgeIllegalRuntimeException{
        if(age < 1 || age > 200) {
            throw new itheimaAgeIllegalRuntimeException("出现异常");
        } else {
            System.out.println("OK");
        }
    }
}
