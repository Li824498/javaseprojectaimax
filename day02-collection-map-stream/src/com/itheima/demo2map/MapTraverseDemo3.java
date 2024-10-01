package com.itheima.demo2map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapTraverseDemo3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 23);
        map.put("李四", 24);
        map.put("王五", 25);
        map.put("赵六", 24);
        System.out.println(map);

//        Set<String> keys = map.keySet();
//        for (String key: keys) {
//            System.out.println(key + "=" + map.get(key));
//        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//        System.out.println(entries);

//        for (Map.Entry<String, Integer> entry : entries) {
//            System.out.println(entry.getKey() + "=" + entry.getValue());
//            System.out.println(entry.getKey() + "=" + entry.getValue());
//        }

        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println(key + "=" + value);
            }
        });

        map.forEach((key, value) -> System.out.println(key + "=" + value));

    }
}
