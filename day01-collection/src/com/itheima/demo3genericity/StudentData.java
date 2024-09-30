package com.itheima.demo3genericity;

public class StudentData implements Data<Student>{

    @Override
    public String name() {
        return "成";
    }
}
