package com.itheima.demo4test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String size;
    private String color;
    private int nums;

    @Override
    public String toString() {
        return size + color;
    }
}



