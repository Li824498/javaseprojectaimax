package com.itheima.relearn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double score;

    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }

}
