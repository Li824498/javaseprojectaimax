package com.itheima.demo8test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ED3 {
    public static void main(String[] args) {
        List<Integer> redPacket = getRedPacket();

        for (int i = 0; i < 100; i++) {
            new PeopleGetRedPacket(redPacket, "人" + i).start();
        }

    }
    
    public static List<Integer> getRedPacket() {
        Random r = new Random();
        List<Integer> redPacket = new ArrayList<>();
        for (int i = 0; i < 160; i++) {
            redPacket.add(r.nextInt(30) + 1);
        }
        for (int i = 0; i < 40; i++) { 
            redPacket.add(r.nextInt(30) + 1);
        }
        return redPacket;
    }
}
