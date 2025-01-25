package lesson2.homeWork.locker;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private  static Lock lock = new ReentrantLock();
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
    public void transfer(Account toAccount, double money) {
        try {
            lock.lock();
            Thread.sleep(1);
            this.setBalance(this.getBalance() - money);
            toAccount.setBalance(toAccount.getBalance() + money);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
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
