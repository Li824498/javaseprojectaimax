package com.itheima.relearn;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("world");
        System.out.println(list);

        System.out.println("==========================");
        MyArrayList<String> mlist = new MyArrayList<>();
        mlist.add("Hello");
        mlist.add("world");
        System.out.println(mlist);
        print(mlist);

        System.out.println("==========================");
        printTest(list);

        System.out.println("==========================");
        ArrayList<Integer> in = new ArrayList<>();
        in.add(1);
        in.add(2);
        System.out.println(in);

        System.out.println("==========================");
        String s1 = Integer.toString(1);
        System.out.println(s1);
        int s2 = Integer.valueOf(s1);
        System.out.println(s2);

        System.out.println("==========================");
        Collection<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("Rose");
        names.add("Jim");

        Iterator<String> it = names.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
            it.remove();
        }

        for(String name: names) {
            System.out.println(name);
        }

        names.forEach(e -> System.out.println(e));
        names.forEach(System.out::println);








    }

    public static <T> void print(T t) {
        System.out.println(t);
    }

    public static void printTest(ArrayList<?> list) {
        System.out.println(list);
    }



}
