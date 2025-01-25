package lesson7.homeWork.exercise3;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test3 {
//    Berilgan matnli fayl ichidan eng uzun so’zni topish dasturini tuzing.

    public static void main(String[] args) {

        String engUzunSoz = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("io/l1/fayl.txt"))){
            String qator;
            while ((qator = bufferedReader.readLine()) != null){
                String[] strings = qator.split("\\s+");
                for (String soz : strings){
                    if (soz.length() > engUzunSoz.length()){
                        engUzunSoz = soz;
                    }
                }
            }
            if (!engUzunSoz.isEmpty()){
                System.out.println("eng uzun soz: " + engUzunSoz);
                System.out.println("uzunligi: " + engUzunSoz.length());
            }else {
                System.out.println("bu faylda so'z topilmadi");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
