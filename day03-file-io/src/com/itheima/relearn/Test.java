package com.itheima.relearn;

import java.io.File;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        try {
            oi.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        print(100);

        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        print1(list);

        String i1 = "123";
        System.out.println(Integer.valueOf(i1));

        Collection<String> names = new ArrayList<>();
        names.add("hello");
        names.add("world");
        names.add("java");

        Iterator<String> it = names.iterator();

        while(it.hasNext()) {
            String name = it.next();
            System.out.println(name);
//            it.remove();
        }

        System.out.println("=========================================");

        for (String name : names) {
            System.out.println(name);
//            names.remove(name);
        }

        System.out.println("=========================================");

        names.forEach(s -> System.out.println(s));
        names.forEach(System.out::println);

        System.out.println("=========================================");

        Set<Student> set = new TreeSet<>();
        set.add(new Student("zhangsan", 18, 99.9));
        set.add(new Student("lisi", 19, 88.8));
        set.add(new Student("lisi", 19, 88.8));
        set.add(new Student("lisi", 19, 88.8));
        set.add(new Student("wangwu", 20, 77.7));
        set.add(new Student("wangwu", 20, 77.7));
        set.add(new Student("wangwu", 20, 77.7));

        System.out.println(set);


        System.out.println("====================================");
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        Set<String> set1 = map.keySet();
        System.out.println(set1);

        System.out.println("====================================");

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }

        System.out.println("====================================");

        map.forEach((s, integer) -> System.out.println(s + "=" + integer));

        Map<Student, Integer> map2 = new TreeMap<>((o1, o2) -> Double.compare(o1.getScore(), o2.getScore()));

        System.out.println("==============================================");

        System.out.println(list);
        Stream<String> s1 = list.stream();
//        s1.filter(s -> s.length() > 4).sorted().limit(1).forEach(System.out::println);

        Set<String> c1 = s1.collect(Collectors.toSet());
        System.out.println(c1);


        File f1 = new File("day03-file-io/src/dlei01");
        System.out.println(f1.length());


    }

    public static class Outer{
        public class Inner{
            public void show() throws Exception {
                System.out.println("show");
                throw new Exception("test");
            }
        }
    }

    public static<T> void print(T t) {
        System.out.println(t);
    }

    public static void print1(ArrayList<?> list) {
        System.out.println(list);
    }

}

