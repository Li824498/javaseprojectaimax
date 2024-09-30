package com.itheima.demo4genericity;

import java.util.ArrayList;

public class GenericDemo5 {
    public static void main(String[] args) {
        ArrayList<BMX> BMXs = new ArrayList<>();
        BMXs.add(new BMX());
        BMXs.add(new BMX());
        BMXs.add(new BMX());
        print(BMXs);

//        ArrayList<Xiaomi> xiaomis = new ArrayList<>();
//        xiaomis.add(new Xiaomi());
//        xiaomis.add(new Xiaomi());
//        xiaomis.add(new Xiaomi());
//        print(xiaomis);

//        ArrayList<Dog> dogs = new ArrayList<>();
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//        print(dogs);

    }

    public static void print(ArrayList<? super BMX> list) {
        System.out.println("YES");
    }
}
