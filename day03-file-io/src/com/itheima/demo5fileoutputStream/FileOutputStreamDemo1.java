package com.itheima.demo5fileoutputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamDemo1{
    public static void main(String[] args)  throws Exception{
        OutputStream os = new FileOutputStream("day03-file-io/src/dlei01", true);

        os.write(123);
        os.write('a');
        os.write('测');
        os.write("\r\n".getBytes());

        byte[] bytes = "测试用例666".getBytes();
        os.write(bytes);

        os.write(bytes, 0, 3);
        os.write("\r\n".getBytes());

        os.close();
    }
}
