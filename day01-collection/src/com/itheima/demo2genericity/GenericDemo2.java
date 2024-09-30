package com.itheima.demo2genericity;

public class GenericDemo2 {
    public static void main(String[] args) {
        MyArrayList<String> mylist = new MyArrayList<>();
        mylist.add("hello");
        mylist.add("php");
        mylist.add("java");
        mylist.add("python");
        mylist.remove("php");
        System.out.println(mylist);
    }
}
