package com.itheima.demo2map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("张三", 23);
        map1.put("李四", 24);
        map1.put("王五", 25);
        map1.put("赵六", 24);
        map1.put("张三", 30);
        System.out.println(map1);

        System.out.println("===========================");
        System.out.println(map1.put("张三", 40));
        System.out.println("===========================");
        System.out.println(map1.size());
        System.out.println("===========================");
//        map1.clear();
//        System.out.println(map1.isEmpty());
        System.out.println("===========================");
        System.out.println(map1.get("张三"));
        System.out.println(map1);
        System.out.println("===========================");
        System.out.println(map1.remove("张三"));
        System.out.println(map1);
        System.out.println("===========================");
        System.out.println(map1.containsKey("张三"));
        System.out.println(map1.containsValue(25));
        System.out.println("===========================");
        Set<String> keys = map1.keySet();
        Collection<Integer> values = map1.values();
        System.out.println(keys);
        System.out.println(values);

        System.out.println("===========================");

    }
}
