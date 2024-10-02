package com.itheima.demo6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class cashShare {
    private String cardID;
    private double money;
    private final Lock lk = new ReentrantLock();

    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        lk.lock();
        try {
            if (this.money >= money) {
                System.out.println(name + "取款成功，取款金额：" + money);
                this.money -= money;
                System.out.println("余额：" + this.money);
            } else {
                System.out.println(name + "取款失败，余额不足！");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lk.unlock();
        }
    }
}

