package lesson1.classWork.pulOtkazish;

//1. Card classi
//fields :
// cardNumber string
// balance double
// blocked boolean
//1-carddan 2-cardga pul o'tkazsin

//1-method: 1-cardni balanceni tekshiradi pul yetadimi? 1.5 sekund
//2-method 2-cardni bloklanmaganligini tekshiradi 1.5 sekund
//3-method transfer 1-dan pul chiqarib 2-ga qo'shish kerak 2.5 sekund


public class PerevodDeneg {
    public static void main(String[] args) throws InterruptedException {

        Card card1 = new Card("Card1" ,500_000.0, false);
        Card card2 = new Card("Card2" ,300_000.0, false);
        System.out.println("card1 = " + card1);
        System.out.println("card2 = " + card2);

        Runnable runnableFromCard = () -> checkBlocked(card1);
        Runnable runnableToCard = () ->checkBlocked(card2);
        Thread thread1 = new Thread(runnableFromCard);
        Thread thread2 = new Thread(runnableToCard);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        Runnable runnablePul = () ->
                pulOtqazish(card1,card2,200_000);
        Thread thread3 = new Thread(runnablePul);
        thread3.start();

        thread3.join();

        System.out.println("card1 = " + card1);
        System.out.println("card2 = " + card2);

        int activeCount = Thread.activeCount();
        System.out.println(activeCount);

        Thread[] threads = new Thread[activeCount];
        Thread.enumerate(threads);
        for (Thread thread : threads) {
            System.out.println(thread);
        }

    }

    public static void pulOtqazish(Card fromCard, Card toCard, double money) {
        if (checkBalance(fromCard, money)) {
            fromCard.setBalance(fromCard.getBalance() - money);
            toCard.setBalance(money + toCard.getBalance());
        }
    }

    private static boolean checkBlocked(Card card){
        try {
            Thread.sleep(1500);
            if (card.isBlocked()){
                throw new RuntimeException(card.getCardNumber() + " is blocked");
            }
            return false;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static boolean checkBalance (Card fromCard,double money){
        try {
            Thread.sleep(1500);
            return fromCard.getBalance() >= money;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
