package lesson6.homeWork.exercise7;

import java.time.LocalDate;

public class Test {
//    Joriy oy haqida quyidagicha ma’lumot beruvchi method tuzing:
//    Joriy oyning tartib raqami: 2
//    Oyning davomiyligi: 28
//    Oyning maksimal davomiyligi: 29
//    Kvartalning birinchi oyi: January
//    Oyning nomi: Febrary
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int monthValue = date.getMonthValue();
        int lengthOfMonth = date.lengthOfMonth();
        String name = date.getMonth().name();
        System.out.println("Joriy oyning tartib raqami:" + monthValue);
        System.out.println("Oyning davomiyligi: " + lengthOfMonth);
        if (monthValue == 2){
            System.out.println("Oyning maksimal davomiyligi: " + 29);
        }else {
            System.out.println("Oyning maksimal davomiyligi: " + lengthOfMonth);
        }
        if (monthValue <= 3){
            System.out.println("Kvartalning birinchi oyi: January");
        } else if (monthValue > 3 && monthValue <= 6) {
            System.out.println("Kvartalning birinchi oyi: Aprel");
        } else if (monthValue > 7 && monthValue <= 9) {
            System.out.println("Kvartalning birinchi oyi: Iyul");
        }else {
            System.out.println("Kvartalning birinchi oyi: October");
        }
        System.out.println("Oyning nomi: " + name);
    }
}
