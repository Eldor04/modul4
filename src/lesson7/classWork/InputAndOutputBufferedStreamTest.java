package lesson7.classWork;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputAndOutputBufferedStreamTest {
    public static void main(String[] args) {

        try (BufferedInputStream buf = new BufferedInputStream(new FileInputStream("io/doc.txt"))){
            while (buf.available()>0){
                System.out.println((char) buf.read());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
