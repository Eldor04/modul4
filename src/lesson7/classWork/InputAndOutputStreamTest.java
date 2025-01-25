package lesson7.classWork;

import java.io.*;

public class InputAndOutputStreamTest {
    public static void main(String[] args) {

//        inputStream();

//        outputStream();

    }

    private static void outputStream() {
        String s = "io/doc.txt";

        try(OutputStream outputStream = new FileOutputStream(s,true)) {
            String string = " Ooo Thank you";
            byte[] bytes = string.getBytes();
            outputStream.write(bytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void inputStream() {
        File file = new File("io/doc.txt");
//        InputStream inputStream = null;
        try (InputStream inputStream = new FileInputStream(file)){
//           inputStream = new FileInputStream(file);
            byte[] bytes = inputStream.readAllBytes();
            String string = new String(bytes);
            System.out.println(string);

//            int read = inputStream.read();
//            System.out.println((char) read);

        } catch (IOException e) {
            throw new RuntimeException(e);
//        } finally {
//            if (inputStream != null) {
//                try {
//                    inputStream.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
        }
    }

}
