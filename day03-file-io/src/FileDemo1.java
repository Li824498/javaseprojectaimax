import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\code\\itheima\\part3\\112798888_p0.jpg");

        System.out.println(f1.length());
        System.out.println(f1.getName());
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f1.exists());
        System.out.println(f1.lastModified());
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsolutePath());

        System.out.println("==========================================");
        //  相对路径
        File f2 = new File("day03-file-io/src/dlei01");
        System.out.println(f2.length());

        //  对象不存在
        File f3 = new File("day03-file-io/src/dlei02");
        System.out.println(f3.exists());
        System.out.println(f3.createNewFile());

        //  创建创建文件夹
        File f4 = new File("D:\\code\\itheima\\part3\\aa");
        System.out.println(f4.mkdir());
        File f5 = new File("D:\\code\\itheima\\part3\\b\\b");
        System.out.println(f5.mkdirs());
        //  删除操作
        File f6 = new File("day03-file-io/src/dlei02");
        System.out.println(f6.delete());
        File f7 = new File("D:\\code\\itheima\\part3\\b\\b");
        System.out.println(f7.delete());
        //  只能删除空文件夹
        File f8 = new File("D:\\code\\itheima\\part3\\aa");
        System.out.println(f8.delete());
        //  获取一级文件名/文件
        File f9 = new File("D:\\game\\background");
        String[] names = f9.list();
        for (String name : names) {
            System.out.println(name);
        }
        File[] files = f9.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsoluteFile());
        }
    }
}
