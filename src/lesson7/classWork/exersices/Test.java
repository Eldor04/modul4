package lesson7.classWork.exersices;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        File file = new File("E:\\JAVA_MODULES\\modul4\\src\\lesson6\\homeWork\\exercise10\\Color.java");
        byte[] bytes;
        try (InputStream inputStream = new FileInputStream(file)){
            bytes = inputStream.readAllBytes();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try (OutputStream outputStream = new FileOutputStream(new File("io/java.txt"))){
            outputStream.write(bytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
