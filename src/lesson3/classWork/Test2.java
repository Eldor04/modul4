package lesson3.classWork;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        var r  = new MyRunnable();
        var th1 = new Thread(r,"Thread ONE");
        var th2 = new Thread(r,"Thread TWO");
        th1.start();
        th2.start();
        Thread.sleep(3000);
        r.stop();
    }

}

class MyRunnable implements Runnable {
    private boolean active;

    @Override
    public void run() {
        active = true;
        while (active) {
        }
        System.out.println(Thread.currentThread() + "::::::::::::::::::Finished");
    }

    public void stop() {
        active = false;
    }
}
