package lesson2.homeWork.block;



public class Test {
    public static void main(String[] args) {

        Account account1 = new Account("Dave",500);
        Account account2 = new Account("Lucy",400);
        Account account3 = new Account("Garold",350);
        Account account4 = new Account("John",0);
        System.out.println("account4 = " + account4);

        Runnable runnable1 = () -> account1.transfer(account4,400);
        Runnable runnable2 = () -> account2.transfer(account4,300);
        Runnable runnable3 = () -> account3.transfer(account4,200);
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("account4 = " + account4);


    }
}
