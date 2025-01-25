package lesson7.classWork;

import java.io.File;

public class Plus {

    public static void main(String[] args) {
        File file = new File("io/f1/f2/doc2.txt");
        System.out.println(file.getParentFile());
    }
}
