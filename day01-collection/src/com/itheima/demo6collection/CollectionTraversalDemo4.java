package com.itheima.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionTraversalDemo4 {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("Rose");
        names.add("Jim");

//        for (String name : names) {
//            System.out.println(name);
//        }
//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        names.forEach(s -> System.out.println(s));
//        names.forEach(System.out::println);
    }
}
