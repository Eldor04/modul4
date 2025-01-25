package lesson7.classWork;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.time.LocalDateTime;

public class ReaderAndWriterTest {
    public static void main(String[] args) {

//        reader();

//        writer();



    }

    private static void writer() {
        try( Writer writer = new FileWriter("io/writer.txt")) {
            writer.write("Hii "  + LocalDateTime.now());


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void reader() {
        try(Reader reader = new FileReader("io/doc.txt")) {
            StringBuilder stringBuilder = new StringBuilder();



            while (reader.ready()){
                stringBuilder.append((char) reader.read());
//                System.out.println((char)reader.read());
            }
            System.out.println(stringBuilder);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
