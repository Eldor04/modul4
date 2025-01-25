package lesson6.classWork.DeprecateClasses;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {

//        calendar.add(Calendar.HOUR,2);

//        2018.01.01
//        Calendar calendar = new GregorianCalendar();

/*        Calendar start = Calendar.getInstance();


        start.set(2018,0,1,0,0);
        Date date = start.getTime();
        System.out.println(date);

        Calendar currentCalendar = Calendar.getInstance();

        int workingDays  = 0;
        while (start.before(currentCalendar)){
            int dayOfWeek = start.get(Calendar.DAY_OF_WEEK);

            if (dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY) {
                workingDays++;
            }
            start.add(Calendar.DATE, 1);
        }
        System.out.println(workingDays);*/

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy'T'HH:mm:ss S w W D");

        Date date = new Date();
        String format = dateFormat.format(date);
        System.out.println(format);




//        System.out.println(start);

//        int firstdayaweek = calendar.getMinimalDaysInFirstWeek();
//        System.out.println("firstdayaweek = " + firstdayaweek);

//        int weekYear = calendar.getWeekYear();
//        System.out.println(weekYear);

    }
}
