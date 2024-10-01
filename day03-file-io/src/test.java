import java.io.File;

public class test {
    public static void main(String[] args) {
        File dir = new File("D:/");
        searchFile(dir, "112798888_p0.jpg");

    }

    private static void searchFile(File dir, String image) {
        if (dir == null || !dir.exists() || dir.isFile()) {
            return;
        }

        File[] files = dir.listFiles();

        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.getName().equals(image)) {
                    System.out.println("找到");
                    System.out.println(file);
                    return;
                } else if(file.isDirectory()) {
                    searchFile(file, image);
                }
            }

        }
    }


}
