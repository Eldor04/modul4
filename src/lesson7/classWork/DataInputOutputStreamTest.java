package lesson7.classWork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamTest {
    public static void main(String[] args) {

//        write();


//        read();


    }

    private static void read() {
        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream("io/data.txt"))) {
            float v = dataInputStream.readFloat();
            System.out.println(v);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void write() {
        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("io/data.txt"))) {
            dataOutputStream.writeFloat(97.85F);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
