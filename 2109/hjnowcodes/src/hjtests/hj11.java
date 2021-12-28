package hjtests; /**
 * @Date:2021/12/27 12:54
 * @Author:NANDI_GUO
 */
import java.util.*;
public class hj11 {
    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int input = in.nextInt();
        String str = String.valueOf(input);
        List<Character> ch = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            ch.add(str.charAt(i));
        }
        for (int i = str.length() - 1; i >= 0; i--){
            System.out.print((ch.get(i)).toString());
        }
    }
}

