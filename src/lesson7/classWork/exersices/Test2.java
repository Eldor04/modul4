package lesson7.classWork.exersices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Test2 {
    public static void main(String[] args) {

        try (BufferedReader buf = new BufferedReader(new FileReader("io/java.txt"));
             BufferedWriter bufWrite = new BufferedWriter(new FileWriter("io/buffer.txt"))){
            String line;
            while ((line = buf.readLine()) != null){
                bufWrite.write(buf.readLine() + "\n");

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
