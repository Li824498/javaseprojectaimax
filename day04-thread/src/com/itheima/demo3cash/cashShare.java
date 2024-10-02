package com.itheima.demo3cash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class cashShare {
    private String cardID;
    private double money;

    public void drawMoney(double money) {
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

