package com.itheima.demo2genericity;

import java.util.ArrayList;

public class GenericDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("java");
        list.add("php");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
