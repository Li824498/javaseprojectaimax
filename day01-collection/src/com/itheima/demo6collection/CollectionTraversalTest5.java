package com.itheima.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversalTest5 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<String>();
        list.add("Jack");
        list.add("Jack");
        list.add("Jack");
        list.add("Rose");
        list.add("Jim");
//
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            String name = it.next();
            System.out.println(name);
            it.remove();

        }

        System.out.println(list);


//        for (int i = 0; i < list.size(); i++) {
//            String name = list.get(i);
//            list.remove(name);
//            i--;
//        }
//        System.out.println(list);
//
//        for (int i = list.size() - 1; i > -1; i--) {
//            String name = list.get(i);
//            list.remove(name);
//
//        }
//        System.out.println(list);
//
//        for (String name : list) {
//            list.remove(name);
//        }
//        System.out.println(list);
//
//        list.forEach(s -> list.remove(s));

    }
}
