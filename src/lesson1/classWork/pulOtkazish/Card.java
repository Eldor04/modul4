package lesson1.classWork.pulOtkazish;

public class Card {
    private String cardNumber;
    private Double balance;
    private boolean blocked;


    public Card(String cardNumber, Double balance, boolean blocked) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.blocked = blocked;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber='" + cardNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
