package lesson7.homeWork.exercise1;

import java.io.File;

public class Test {
//    Berilgan papka ichidagi file va papkalarni nomida qidirilayotgan matn bor bo’lgan fayl
//    va papkalarni ekranga chiqazish dasturini tuzing. Bunda berilgan papka ichida
//    papkalar bor bo’lsa ularni ichidan ham qidirish kerak (Rekursiyadan foydalaniladi).

    public static void main(String[] args) {


        File file = new File("E:\\JAVA_MODULES\\modul4\\io\\l1");
        String string = "fayl.txt";
        showAll(file,string);
    }
    private static void showAll(File file,String string){
        File[] files = file.listFiles();
        if (files != null){
            for (File oneFile : files){
                if (oneFile.getName().contains(string)){
                    System.out.println(file.getAbsolutePath());
                }
                if (oneFile.isDirectory()){
                    showAll(file,string);
                }
            }
        }
    }
}
