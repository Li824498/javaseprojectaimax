package com.itheima.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversalDemo3 {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("Rose");
        names.add("Jim");

        Iterator<String> it = names.iterator();

        while(it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }
    }
}
