package com.itheima.demo3stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<String> list = List.of("张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山");
//        System.out.println(list);

        System.out.println(list.stream());
        Stream<String> s1 = list.stream();

        Map<String, Integer> map = new HashMap<>();
        map.put("张无忌", 16);
        map.put("赵敏", 18);
        map.put("周芷若", 17);
        map.put("张强", 19);
        map.put("张三丰", 100);
        map.put("张翠山", 20);

        Stream<Map.Entry<String, Integer>> s4 = map.entrySet().stream();
        Stream<String> s2 = map.keySet().stream();
        Stream<Integer> s3 = map.values().stream();

        String[] names = {"张无忌", "赵敏", "周芷若", "张强", "张三丰", "张翠山"};
        Stream<String> s5 = stream(names);
        Stream<String> s6 = Stream.of(names);

    }
}
