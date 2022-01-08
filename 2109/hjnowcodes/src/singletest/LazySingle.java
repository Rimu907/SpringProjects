package singletest;

/**
 * @Date:2022/1/8 9:56
 * @Author:NANDI_GUO
 */
public class LazySingle {
    private int count;

    private LazySingle() {
        count++;
        System.out.println(Thread.currentThread().getName()+"创建了对象"+count+"次");
    }

    private static volatile LazySingle instance = null;

    public static LazySingle getInstance() {
        if (instance == null) {
            synchronized(LazySingle.class) {
                if (instance == null) {
                    instance = new LazySingle();
                }
            }
        }
        return instance;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    LazySingle.getInstance();
                }
            }).start();
        }
    }
}

//class Another{
//    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException {
//        Class<LazySingle> aClass = LazySingle.class;
//        aClass.setAccessible(true);
//        aClass.newInstance();
//    }
//}
