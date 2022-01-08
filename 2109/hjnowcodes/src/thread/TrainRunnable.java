package thread;

/**
 * @Date:2022/1/7 12:56
 * @Author:NANDI_GUO
 */
public class TrainRunnable implements Runnable {
    private int tickets = 1000;

    @Override
    public void run() {
        while (true){
            synchronized(TrainRunnable.class){
                if (tickets<=0){
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"-->拿到了第"+tickets--+"票");
            }
        }
    }

    public static void main(String[] args) {
        TrainRunnable trainRunnable = new TrainRunnable();

        new Thread(trainRunnable,"小明").start();
        new Thread(trainRunnable,"一郎").start();
        new Thread(trainRunnable,"黄牛").start();
    }
}
