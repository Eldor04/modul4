package lesson10.classWork;

import java.io.IOException;
import java.util.logging.*;

public class LoggerTest {

    public static Logger logger = Logger.getLogger(LoggerTest.class.getName());

    public static void main(String[] args) throws IOException {

        logger.setLevel(Level.WARNING);

        FileHandler fileHandler = new FileHandler("logs/fileLog.txt",true);
//        fileHandler.setFormatter(new SimpleFormatter());
        Formatter formatter = new MyLogFormatter();
        fileHandler.setFormatter(formatter);
        logger.addHandler(fileHandler);

        LogRecord logRecord = new LogRecord(Level.WARNING, "This WARNING log test");
        logger.log(logRecord);
//        logger.log(Level.WARNING,"This INFO log test");

//        logger.info("Info ...");
//        logger.severe("Severe ...");
//        logger.warning("Warning ...");

    }
}
