package lesson7.homeWork.exercise7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public class Test7 {
//    Calendar classidan foydalangan holda komputeringizni c yoki d diskida
//    joriy yil nomida(masalan: 2020) papka yarating
//    Ushbu papkaning ichida barcha oylarning nomida papkalar yarating.
//    Oy nomlaridagi har bir papkaning ichida ushbu oyga tegisli
//    barcha sanalar  nomida matnli(txt) fayl yarating
//    (Masalan: January papkasida 31 ta txt fayli bo'ladi).
//    Ushbu fayllarning ichida dastur ishga tushgandagi vaqt rasmdagi ko'rinishda yozilsin(rasm.png).

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        Path joylashuvi = Paths.get("E:", String.valueOf(year));
        if (Files.notExists(joylashuvi)) {
            try {
                Files.createDirectory(joylashuvi);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        for (int month = 0; month < 12; month++) {
            String monthName = new SimpleDateFormat("MMMM").format(new Date(calendar.getTimeInMillis()));
            Path oyJoylashuvi = joylashuvi.resolve(monthName);

            try {
                if (Files.notExists(oyJoylashuvi)) {
                    Files.createDirectory(oyJoylashuvi);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            calendar.set(year, month, 1);
            int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            for (int day = 1; day <= days; day++) {
                String dayStr = String.format("%02d", day);
                String fileName = monthName + "_" + dayStr + "." + "txt";
                Path dayFile = oyJoylashuvi.resolve(fileName);

                try (BufferedWriter writer = Files.newBufferedWriter(dayFile)) {
                    String currentDate = new SimpleDateFormat("yy:MM:dd").format(calendar.getTime());
                    writer.write(currentDate);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                calendar.add(Calendar.DAY_OF_MONTH, 1);
            }
        }

    }
}
