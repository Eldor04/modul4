package lesson7.homeWork.exercise5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Test5 {
//    Ikkita matnli fayl  ichidagilarni birlashtirib uchunchi faylga yozadigan dastur tuzing

    public static void main(String[] args) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader("io/l1/fayl.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("io/l1/fayl2.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("io/l1/newFayl.txt")))
        {
            String line;
            while ((line = reader1.readLine()) != null){
                writer.write(line);
                writer.newLine();
            }
            while ((line = reader2.readLine()) != null){
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Fayllar birlashtirildi");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
