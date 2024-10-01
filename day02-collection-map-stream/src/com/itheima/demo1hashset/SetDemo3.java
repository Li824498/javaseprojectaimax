package com.itheima.demo1hashset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {

//        Set<Teacher> teachers = new TreeSet<>(new Comparator<Teacher>() {
//            @Override
//            public int compare(Teacher o1, Teacher o2) {
//                return Double.compare(o1.getSalary(),o2.getSalary());
//            }
//
//        });

        Set<Teacher> teachers = new TreeSet<>((o1, o2) -> Double.compare(o1.getSalary(),o2.getSalary()));

        teachers.add(new Teacher("张三", 18, 9999.4));
        teachers.add(new Teacher("李四", 19, 8888.4));
        teachers.add(new Teacher("王五", 20, 7777.4));

        System.out.println(teachers);

    }
}
