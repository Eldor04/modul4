package lesson2.homeWork.instanceSynchronized;

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
    public synchronized void transfer(Account fromAccount, Account toAccount, double money){
        try {
            Thread.sleep(1);
             fromAccount.setBalance(fromAccount.getBalance() - money);
            toAccount.setBalance(toAccount.getBalance() + money);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String toString() {
        return "Account{" +
                "holder='" + holder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
