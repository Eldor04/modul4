package examExamples.task4;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class MyFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        Instant instant = record.getInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String format = dateTimeFormatter.format(localDateTime);
        Level level = record.getLevel();
        String message = record.getMessage();
        Throwable thrown = record.getThrown();
        if (thrown != null){
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            thrown.printStackTrace(printWriter);
            message = message + "\n" + stringWriter;
        }


        return "%s\n%s:%s\n".formatted(format,level,message);
    }
}
