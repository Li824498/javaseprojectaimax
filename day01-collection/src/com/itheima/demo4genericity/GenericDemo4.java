package com.itheima.demo4genericity;

public class GenericDemo4 {
    public static void main(String[] args) {
        String[] name = {"张三","李四","王五"};
        print(name);
        System.out.println(max(name));
    }


    public static <T> void print(T t){

    }

    public static <T> T max(T t){
        return t;
    }
}
