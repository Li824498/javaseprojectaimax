package com.itheima.relearn;

import java.util.ArrayList;

public class MyArrayList<E> {
    private ArrayList list = new ArrayList();
    public boolean add(E e) {
        return list.add(e);
    }

    public boolean remove(E e){
        return list.remove(e);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
