package com.itheima.demo1exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            System.out.println(div(10, 0));
        } catch(Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
//        System.out.println(div(10, 0));
    }

    private static int div(int i, int j) throws Exception{
        if (i == 0) {
            throw new Exception("除数不能为0");
        }
        int result = i / j;
        return result;
    }
}
