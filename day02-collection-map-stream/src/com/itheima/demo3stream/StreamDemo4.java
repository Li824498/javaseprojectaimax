package com.itheima.demo3stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("张无忌", 16, 5000));
        teachers.add(new Teacher("赵敏", 18, 6000));
        teachers.add(new Teacher("周芷若", 17, 5500));
        teachers.add(new Teacher("张强", 19, 4000));

        teachers.stream().forEach(System.out::println);
        System.out.println(teachers.stream().count());
        Optional<Teacher> max = teachers.stream().max((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary()));
        System.out.println(max.get());


        List<String> list = List.of("张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山");
        Stream<String> s1 = list.stream();
//        //收集到Set中
//        Set<String> c1 = s1.collect(Collectors.toSet());
//        System.out.println(c1);
//        //收集到list中
//        List<String> l1 = s1.collect(Collectors.toList());
//        System.out.println(l1);
//        //收集到数组中
//        Object[] array = s1.toArray();
//        System.out.println(array);
//        System.out.println(Arrays.toString(array));
//        //收集到map
//        Map<String, Double> m1 = teachers.stream().collect(Collectors.toMap(Teacher::getName, Teacher::getSalary));
//        System.out.println(m1);


    }
}
