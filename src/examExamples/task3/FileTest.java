package examExamples.task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileTest {
    public static void main(String[] args){
        try (BufferedReader reader = new BufferedReader(new FileReader("io/exam.txt"))){
            String line;
            Pattern pattern = Pattern.compile("\\d{2,}");
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()){
                    System.out.println(matcher.group());
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
