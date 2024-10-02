package com.itheima.demo7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ED3 {
    public static void main(String[] args) {
        List<Integer> redPacket = getRedPacket();

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
