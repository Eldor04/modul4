package examExamples.task4;

import lesson10.homeWork.MyFormat;

import java.io.IOException;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class LogTest {
    public static Logger logger = Logger.getLogger(LogTest.class.getName());

    public static void main(String[] args) throws IOException {
        logger.setLevel(Level.SEVERE);
        FileHandler fileHandler = new FileHandler("logs/exam.txt");
        MyFormat myFormat = new MyFormat();
        fileHandler.setFormatter(myFormat);
        logger.addHandler(fileHandler);
        LogRecord record = new LogRecord(Level.SEVERE,"This Severe log");
        logger.log(record);

        exception();
    }

    private static void exception() {
        try {
            if (new Random().nextBoolean()) {
                throw new RuntimeException();
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE,"Exception",e);
        }
    }
}
