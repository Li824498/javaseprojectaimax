package com.itheima.demo6collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello");
        list.add("world");
        list.add("java");
        System.out.println(list);

        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("world");
        set.add("java");
        System.out.println(set);
    }
}
