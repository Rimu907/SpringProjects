package thread;

/**
 * @Date:2022/1/7 13:19
 * @Author:NANDI_GUO
 */
public class Race implements Runnable {
    private static String winner;

    @lombok.SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i <= 100 ; i++) {
            if (Thread.currentThread().getName().equals("兔子")){
                Thread.sleep(1);
            }

            boolean flag = gameOver(i);
            if (flag) {
                break;
            }
            System.out.println(Thread.currentThread().getName()+"-->跑了"+i+"步");
        }
    }

    private boolean gameOver(int steps){
        if (winner != null){
            return true;
        }
        if (steps == 100){
            winner = Thread.currentThread().getName();
            System.out.println("Winner is" + winner);
        }

        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();

        new Thread(race,"兔子").start();
        new Thread(race,"乌龟").start();
    }
}
