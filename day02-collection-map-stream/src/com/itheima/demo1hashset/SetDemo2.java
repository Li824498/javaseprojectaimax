package com.itheima.demo1hashset;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        Set<Student> st = new HashSet<>();

        Student s1 = new Student("张三", 18, "北京", "123456");
        Student s2 = new Student("李四", 19, "上海", "123456");
        Student s3 = new Student("张三", 18, "北京", "123456");
        Student s4 = new Student("李四", 19, "上海", "123456");

        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);

        System.out.println(st);


    }
}
