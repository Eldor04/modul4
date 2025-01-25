package lesson7.classWork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReaderAndWriterBufferedTest {
    public static void main(String[] args) {

//        bufferedReader();


//        bufferedWriter();
    }

    private static void bufferedWriter() {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("io/doc.txt",true))) {
            bufferedWriter.write("\nBu text uchun ");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void bufferedReader() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("io/doc.txt"))){
//            String string = bufferedReader.readLine();
//            System.out.println(string);
            String line;
            while ((line = bufferedReader.readLine()) != null){

            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
