package com.itheima.demo8test;

import java.util.List;

public class PeopleGetRedPacket extends Thread{
    private List<Integer> redPacket;
    public PeopleGetRedPacket(List<Integer> redPacket, String name) {
        super(name);
        this.redPacket = redPacket;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            synchronized (redPacket) {
                if (redPacket.isEmpty()) {
                    break;
                }
                int index = (int) (Math.random() * redPacket.size());
                Integer money = redPacket.remove(index);
                System.out.println(name + "抢到了" + money + "元");
                if (redPacket.isEmpty()) {
                    System.out.println(name + "抢完了");
                    return;
                }
            }
        }
    }
}
