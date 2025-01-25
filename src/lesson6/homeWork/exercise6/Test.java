package lesson6.homeWork.exercise6;

import java.time.LocalDate;
import java.time.Year;
import java.time.ZonedDateTime;

public class Test {
    //    Joriy yil haqida quyidagicha ma’lumot beruvchi method tuzing:
//      Joriy yil: 2020  Kabisa yilimi? Ha   Yilning davomiyligi: 366 kun
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        boolean leap = Year.isLeap(year);

        System.out.println("Joriy yil: " + year);
        if (leap){
            System.out.println("Kabisa yilmi? Ha! \nYilning davomiyligi: 366 kun");
        }else {
            System.out.println("Kabisa yilmi? Yoq! \nYilning davomiyligi: 365 kun");
        }

    }
}
