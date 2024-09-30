package com.itheima.demo7list;

import java.util.LinkedList;

public class ListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<String>();

        stack.add("第一颗子弹");
        stack.add("第二颗子弹");
        stack.add("第三颗子弹");
        stack.addFirst("a");
        stack.addLast("b");
        System.out.println(stack.getFirst());
        System.out.println(stack.getLast());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeLast());
        System.out.println(stack);
        stack.clear();




        //栈
        stack.push("第一颗子弹");
        stack.push("第二颗子弹");
        stack.push("第三颗子弹");
        stack.push("第四颗子弹");

        System.out.println(stack);

        System.out.println(stack.poll());
        System.out.println(stack.poll());
        System.out.println(stack.poll());
        System.out.println(stack.poll());

        System.out.println(stack);
    }
}
