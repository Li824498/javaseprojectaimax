package com.itheima.demo6collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("java");
        System.out.println(list);

        list.remove("world");
        System.out.println(list);

        list.clear();
        System.out.println(list);

        System.out.println(list.isEmpty());


        list.add("hello");
        list.add("world");
        list.add("java");

        System.out.println(list.contains("java"));

        System.out.println(list.size());

        Object[] arr = list.toArray();
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
    }
}
