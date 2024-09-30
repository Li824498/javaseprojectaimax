package com.itheima.demo7list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        System.out.println(list);

        list.add(2,"王五1");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.set(2, "王五2");
        System.out.println(list);

        System.out.println(list.get(2));

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("====================");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("====================");

        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("====================");

        list.forEach(name -> System.out.println(name));
        list.forEach(System.out::println);
    }
}
