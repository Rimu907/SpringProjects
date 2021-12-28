package hjtests;

import java.util.*;


/**
 * @Date:2021/12/27 13:16
 * @Author:NANDI_GUO
 */
public class hj13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String input = in.nextLine();
        List<String> list = Arrays.asList(input.split(" "));
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}
