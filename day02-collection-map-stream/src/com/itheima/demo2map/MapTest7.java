package com.itheima.demo2map;

import java.util.Map;
import java.util.TreeMap;

public class MapTest7 {
    public static void main(String[] args) {
        Map<Teacher, Integer> map = new TreeMap<>((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary()));
        map.put(new Teacher("李四", 24, 4000), 2);
        map.put(new Teacher("王五", 25, 5000), 3);
        map.put(new Teacher("张三", 23, 3000), 1);
        map.put(new Teacher("赵六", 24, 6000), 4);

        System.out.println(map);
    }
}
