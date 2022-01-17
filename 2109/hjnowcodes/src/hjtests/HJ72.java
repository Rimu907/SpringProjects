package hjtests;

/**
 * @Date:2022/1/14 18:18
 * @Author:NANDI_GUO
 */
import java.util.*;
public class HJ72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap();
        map.put(1,31);
        map.put(2,0);
        map.put(3,31);
        map.put(4,30);
        map.put(5,31);
        map.put(6,30);
        map.put(7,31);
        map.put(8,31);
        map.put(9,30);
        map.put(10,31);
        map.put(11,30);
        map.put(12,31);
        while (sc.hasNext()) {
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            if (year % 4 == 0 & year % 100 != 0 ) map.put(2,29);
            else map.put(2,28);
            int count = 0;
            for (int i = 1; i < month ; i++) {
                    count += map.get(i);
            }
            System.out.println(count+day);
        }
    }
}
