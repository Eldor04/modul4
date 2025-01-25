package lesson1.classWork.pulOtkazish;

public class Test {
    public static void main(String[] args) {

        Card card1 = new Card("Card1" ,500_000.0, false);
        Card card2 = new Card("Card2" ,300_000.0, true);

        System.out.println(card1);
        System.out.println(card2);
        pulOtqazish(card1,card2,400_000.0);
        System.out.println(card1);
        System.out.println(card2);

    }

    public static void pulOtqazish(Card fromCard, Card toCard, double money) {
        if (!(checkBlockFromCard(fromCard) || checkBlockToCard(toCard))){
            throw new RuntimeException("Card is blocked");
        }
        if (checkBalance(fromCard,money)){
            fromCard.setBalance(fromCard.getBalance() - money);
            toCard.setBalance(money + toCard.getBalance());
        }




    }
    public static boolean checkBlockFromCard(Card fromCard){
        try {
            Thread.sleep(1500);
            boolean block  = fromCard.isBlocked();
            if (!block){
                System.out.println(fromCard + " blocked");
            }
            return fromCard.isBlocked();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean checkBlockToCard(Card toCard){
        try {
            Thread.sleep(1500);boolean block  = toCard.isBlocked();
            if (!block){
                System.out.println(toCard + " blocked");
            }
            return toCard.isBlocked();
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
