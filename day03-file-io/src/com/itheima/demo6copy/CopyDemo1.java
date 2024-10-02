package com.itheima.demo6copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDemo1 {
    public static void main(String[] args) {
        String src = "D:/game/background/112798888_p0.jpg";
        String dest = "D:/game/background/112798888_p0_copy.jpg";

        try {
            copyfile(src, dest);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private static void copyfile(String src, String dest) throws Exception{
        try (
                InputStream fis = new FileInputStream(src);
                OutputStream fos = new FileOutputStream(dest);

                ){
            byte[] b = new byte[1024];
            int len;
            while ((len = fis.read(b)) != -1) {
                fos.write(b, 0 ,len);
            }
            System.out.println("成功");
        } finally {

        }

    }
}
