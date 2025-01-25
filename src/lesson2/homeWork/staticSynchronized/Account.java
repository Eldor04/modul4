package lesson2.homeWork.staticSynchronized;

public class Account {
    private String holder;
    private double balance;

    public Account(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Account{" +
                "holder='" + holder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
