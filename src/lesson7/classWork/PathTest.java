package lesson7.classWork;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest {
    public static void main(String[] args) {
        Path path = Paths.get("io","f1","f2");
        System.out.println("path = " + path);


//        System.out.println("path.getFileName() = " + path.getFileName());

//        path = path.toAbsolutePath();
//        System.out.println(path);
//        Path root = path.getRoot();
//        System.out.println(root);

//        path = path.resolve("doc2.txt");
//        System.out.println("resolve = " + path);

//
//        try {
//            byte[] bytes = Files.readAllBytes(path);
//            System.out.println(new String(bytes));
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        copy();

    }

    private static void copy() {
        Path path1 = Paths.get("io", "f1", "f2", "doc2.txt");
        Path path2 = Paths.get("io", "f1", "f2", "copydoc2.txt");

        try {
            Files.copy(path1,path2, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
