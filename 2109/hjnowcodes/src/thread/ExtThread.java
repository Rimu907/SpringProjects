package thread;

/**
 * @Date:2022/1/7 8:59
 * @Author:NANDI_GUO
 */
public class ExtThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程"+i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ExtThread extThread1 = new ExtThread();
        ExtThread extThread2 = new ExtThread();
        ExtThread extThread3 = new ExtThread();
        ExtThread extThread4 = new ExtThread();

        extThread1.start();
        extThread2.start();
        extThread3.start();
        extThread4.start();
    }
}
