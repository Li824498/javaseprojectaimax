package com.itheima.demo4fileimputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception{
        File f1 = new File("day03-file-io/src/dlei01");
        InputStream is = new FileInputStream(f1);

        int b1;
        while ((b1 = is.read()) != -1) {
//            System.out.println(b1);
//            System.out.println("==============");
            System.out.print((char) b1);
        }

        byte[] b2 = new byte[3];
        int len;
        while ((len = is.read(b2)) != -1) {
//            System.out.print(b2);
            System.out.print(new String(b2, 0 ,len));
            System.out.println(len);
        }

        System.out.println("====================");

        //  中文输入解决方案
        byte[] b3 = new byte[1024];
        b3 = is.readAllBytes();
        System.out.println(new String(b3));
    }
}
