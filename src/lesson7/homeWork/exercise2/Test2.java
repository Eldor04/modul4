package lesson7.homeWork.exercise2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test2 {
//    Berilgan matnli fayl ichida nechta qator borligini topuvchi dastur tuzing.

    public static void main(String[] args) throws FileNotFoundException {

        int countLine = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("io/l1/fayl.txt"))){
            while (bufferedReader.readLine() != null){
                countLine++;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(countLine);

    }
}
