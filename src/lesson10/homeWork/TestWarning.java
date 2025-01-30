package lesson10.homeWork;

import java.io.IOException;
import java.util.Random;
import java.util.logging.*;

public class TestWarning {

    public static Logger logger = Logger.getLogger(TestWarning.class.getName());

    public static void main(String[] args) throws IOException {
        logger.setLevel(Level.WARNING);

        FileHandler fileHandler = new FileHandler("logs/logWarning.txt");
//        Formatter format = new SimpleFormatter();
        Formatter format = new MyFormat();
        fileHandler.setFormatter(format);


        logger.addHandler(fileHandler);
        LogRecord record = new LogRecord(Level.WARNING,"This Warning log");
        logger.log(record);

        exception();

    }

    private static void exception() {
        try {

            if (new Random().nextBoolean()) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            logger.log(Level.SEVERE,"Exception ",e);
            throw new RuntimeException(e);
        }
    }
}
