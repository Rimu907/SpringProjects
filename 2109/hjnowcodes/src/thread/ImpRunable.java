package thread;

/**
 * @Date:2022/1/7 9:18
 * @Author:NANDI_GUO
 */
public class ImpRunable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("线程"+i);
        }
    }

    public static void main(String[] args) {
        ImpRunable impThread = new ImpRunable();
        Thread thread1 = new Thread(impThread);
        Thread thread2 = new Thread(impThread);
        Thread thread3 = new Thread(impThread);
        Thread thread4 = new Thread(impThread);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
