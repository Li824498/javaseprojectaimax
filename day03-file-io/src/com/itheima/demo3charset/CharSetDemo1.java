package com.itheima.demo3charset;

public class CharSetDemo1 {
    public static void main(String[] args) throws Exception{
        String name = "测试用例abc";
//        byte[] bytes = name.getBytes();
        byte[] bytes = name.getBytes("GBK");
        System.out.println(bytes);

//        String name2 = new String(bytes);
        String name2 = new String(bytes,"GBK");
        System.out.println(name2);
    }
}
