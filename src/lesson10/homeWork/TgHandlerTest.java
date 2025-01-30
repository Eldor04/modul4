package lesson10.homeWork;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TgHandlerTest {

    public static Logger logger = Logger.getLogger(TgHandlerTest.class.getName());
    public static void main(String[] args) {

        TelegramHandler telegramHandler = new TelegramHandler();

        MyFormat format = new MyFormat();

        telegramHandler.setFormatter(format);
        logger.addHandler(telegramHandler);

        logger.info("This is and not sent telegram");

        exception();

    }

    private static void exception() {
        try {
            if (true){
                throw new RuntimeException("This specific exception");
            }
        } catch (RuntimeException e) {
            logger.log(Level.SEVERE,e.getMessage(),e);
        }
    }
}
