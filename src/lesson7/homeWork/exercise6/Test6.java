package lesson7.homeWork.exercise6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test6 {
//    Berilgan fayldagi barcha lug’at so’zlaridan map yarating va mapni ichidan so’z qidiradigan dastur tuzing(lug’at.txt).

    public static void main(String[] args) {
        Map<String,String> lugat = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("io/l1/lug'at.txt"))){
            String qator;
            while ((qator = reader.readLine()) != null){
                String[] sozlar = qator.split(" : ");
                for (int i = 0; i < sozlar.length; i = i + 2) {
                    lugat.put(sozlar[i],sozlar[i+1]);
                }
            }
            System.out.println("so'zlar mapga ko'shildi");
            System.out.println(lugat);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Qidirilayotgan so'zni kiriting: ");
        String findWord = scanner.nextLine();

        if (lugat.containsKey(findWord)) {
            System.out.println(findWord + " : " + lugat.get(findWord));
        } else {
            System.out.println("So'z topilmadi");
        }
    }
}
