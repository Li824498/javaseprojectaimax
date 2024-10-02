package com.itheima.demo5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Synchronized;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class cashShare {
    private String cardID;
    private double money;

    public synchronized void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        if (this.money >= money) {
            System.out.println(name + "取款成功，取款金额：" + money);
            this.money -= money;
            System.out.println("余额：" + this.money);
        } else {
            System.out.println(name + "取款失败，余额不足！");
        }
    }
}

