package lesson6.classWork.DeprecateClasses;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
//
//        Date date = new Date(0,0,1);
//        System.out.println("date = " + date);
//
//        long time = System.currentTimeMillis();
//        Date date1 = new Date(time);
//        System.out.println("date1 = " + date1);

//        Date date1 = new Date();
//        System.out.println(date1);
//
//        date1.setTime(78586265225L);
//        System.out.println(date1);
//
//        Date date2 = new Date(System.currentTimeMillis());
//
//        boolean after = date1.after(date2);
//        System.out.println(after);

        Date date = new Date();

        date.setTime(date.getTime() + 2 * 60 * 60 * 60);
        System.out.println(date);


    }
}
