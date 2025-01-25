package lesson7.classWork;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {

//        File folder = new File("io/doc.txt");
//        if (!folder.exists()){
//            try {
//                folder.createNewFile();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//       if (folder.exists()){
//           folder.delete();
//       }
//        String absolutePath = folder.getAbsolutePath();
//        System.out.println(absolutePath);
//
//        System.out.println(folder.getParent());
//        folder = folder.getAbsoluteFile();
//        System.out.println(folder);
//
//        System.out.println(folder.getParentFile().getParentFile().getParent());


        File folder = new File("E:\\");
        showAll(folder,"ImtihonJavoblari.txt");

    }

    public static void showAll(File file,String fileName){
        File[] files = file.listFiles();
        if (files != null) {
            for (File oneFile : files) {
                if (oneFile.getName().equals(fileName)) {
                    System.out.println(oneFile);
                }
                if (oneFile.isDirectory()) {
                    showAll(oneFile,fileName);
                }
            }
        }
    }


}
