package com.itheima.demo4test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"a", "b", "c");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
