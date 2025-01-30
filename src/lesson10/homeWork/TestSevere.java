package lesson10.homeWork;

import java.io.IOException;
import java.util.Random;
import java.util.logging.*;

public class TestSevere {
    public static Logger logger = Logger.getLogger(TestSevere.class.getName());

    public static void main(String[] args) throws IOException {
        logger.setLevel(Level.SEVERE);

        FileHandler fileHandler = new FileHandler("logs/severe.txt");



        Formatter format = new MyFormat();
        fileHandler.setFormatter(format);

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
        } catch (RuntimeException e) {
            logger.log(Level.SEVERE,"Exeption ",e);
            throw new RuntimeException(e);
        }
    }
}
