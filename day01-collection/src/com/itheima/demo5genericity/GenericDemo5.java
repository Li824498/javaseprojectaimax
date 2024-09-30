package com.itheima.demo5genericity;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo5 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();

        Integer b = 1;
//        Integer c = new Integer(2);// 过时
        Integer c = Integer.valueOf(2);
        System.out.println(c);

        Integer i1 = 120;
        Integer i2 = 120;
        System.out.println(i1 == i2);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(123);
        list.add(12);
        System.out.println(list.get(0));

        int i = 100;
//        String s1 = i + "";
        String s1 = Integer.toString(i); // s1 =
        System.out.println(s1);

        int s2 = Integer.valueOf(s1); // s2 =
        System.out.println(i2);
    }
}
