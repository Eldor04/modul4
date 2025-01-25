package lesson7.homeWork.exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test4 {
//    Berilgan fayl(ixtiyoriy formatdagi)dan nusxa oluvchi dastur tuzing.
    public static void main(String[] args) {
        try {
            Path fayl = Paths.get("io/l1/fayl.txt");
            Path newFayl = Paths.get("io/l1/newFayl.txt");
            Files.copy(fayl,newFayl, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Fayldan kopiya olindi");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
