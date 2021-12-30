package hjtests;

/**
 * @Date:2021/12/28 15:05
 * @Author:NANDI_GUO
 */
import java.util.*;

public class hj37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int month = sc.nextInt();
            int oneMonth = 1;
            int twoMonth = 0;
            int threeMonth = 0;

            int addVal = 0;
            for (int i = 2; i <= month; i++) {
                threeMonth += twoMonth;
                twoMonth = oneMonth;
                oneMonth = threeMonth;
            }
            System.out.println(oneMonth+twoMonth+threeMonth);
        }
    }
}
