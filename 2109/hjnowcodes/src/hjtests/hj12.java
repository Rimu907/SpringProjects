package hjtests; /**
 * @Date:2021/12/27 13:10
 * @Author:NANDI_GUO
 */
import java.util.*;
public class hj12 {
    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String input = in.nextLine();
        StringBuffer sb = new StringBuffer(input);
        System.out.println((sb.reverse()).toString());
    }
}
