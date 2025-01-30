package lesson10.homeWork;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class TelegramHandler extends StreamHandler {

    @Override
    public void publish(LogRecord record) {
        String text = this.getFormatter().format(record);
        System.out.println("Buni telegramga yuborish kerak " + text);
    }

    @Override
    public boolean isLoggable(LogRecord record) {
        return record.getLevel() == Level.SEVERE;
    }
}
