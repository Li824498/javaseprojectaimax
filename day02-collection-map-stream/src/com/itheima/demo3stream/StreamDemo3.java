package com.itheima.demo3stream;

import java.io.Serializable;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        List<String> list = List.of("张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山");

        Map<String, Integer> map = new HashMap<>();
        map.put("张无忌", 16);
        map.put("赵敏", 18);
        map.put("周芷若", 17);
        map.put("张强", 19);
        map.put("张三丰", 100);
        map.put("张翠山", 20);

        Stream<String> s1 = list.stream();

//        s1.filter(s -> s.startsWith("张") && s.length() == 3).forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
//        s1.filter(s -> s.startsWith("张") && s.length() == 3).forEach(System.out::println);


        List<Double> scores = new ArrayList<>();
        scores.add(99.5);
        scores.add(100.5);
        scores.add(66.5);
        scores.add(66.5);
        scores.add(66.5);
        scores.add(88.5);
        scores.add(77.5);
//        scores.stream().sorted().forEach(System.out::println);

//        scores.stream().sorted(new Comparator<Double>() {
//            @Override
//            public int compare(Double o1, Double o2) {
//                return Double.compare(o1, o2);
//            }
//        }).forEach(System.out::println);

        scores.stream().sorted((o1, o2) -> Double.compare(o1, o2)).forEach(System.out::println);
        System.out.println("=======================================");
        scores.stream().sorted((o1, o2) -> Double.compare(o1, o2)).limit(2).forEach(System.out::println);
        System.out.println("=======================================");
        scores.stream().sorted((o1, o2) -> Double.compare(o1, o2)).skip(2).forEach(System.out::println);
        System.out.println("=======================================");
        scores.stream().distinct().forEach(System.out::println);
        System.out.println("=======================================");
        Stream<Double> s2 = scores.stream().map(s -> s + 10);
        Stream<Object> s3 = Stream.concat(s1, s2);
        s3.forEach(System.out::println);


    }
}
