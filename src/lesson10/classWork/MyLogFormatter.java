package lesson10.classWork;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class MyLogFormatter extends Formatter {



    @Override
    public String format(LogRecord record) {

        Instant instant = record.getInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String dateTimeString = formatter.format(localDateTime);
        String className = record.getSourceClassName();
        long longThreadID = record.getLongThreadID();
        Level level = record.getLevel();
        String message = record.getMessage();

        return "%s %s %s\n%s: %s".formatted(dateTimeString,className,longThreadID,level,message);
    }
}
