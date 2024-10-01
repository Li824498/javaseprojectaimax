package com.itheima.demo3stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张翠山");
        list.forEach(s -> System.out.println(s));

        //way1:
        List<String> newlist = new ArrayList<>();
        for(String name : list) {
            if (name.startsWith("张") && name.length() == 3) {
                newlist.add(name);
            }
        }
        newlist.forEach(s -> System.out.println(s));

        List<String> newlist2 =list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).collect(Collectors.toList());
        System.out.println(newlist2);

    }
}
