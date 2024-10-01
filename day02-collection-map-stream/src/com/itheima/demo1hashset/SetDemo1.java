package com.itheima.demo1hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("java");
        System.out.println(set);

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("hello");
        set2.add("world");
        set2.add("world");
        set2.add("world");
        set2.add("java");
        System.out.println(set2);

        Set<Double> set3 = new TreeSet<>();
        set3.add(3.14);
        set3.add(3.14);
        set3.add(5.20);
        set3.add(1.1);
        System.out.println(set3);

        System.out.println("=================");
        String s1 = "asd";
        int s2 = 10;
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
    }
}
