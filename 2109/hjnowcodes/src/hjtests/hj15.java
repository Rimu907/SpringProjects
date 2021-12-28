package hjtests; /**
 * @Date:2021/12/27 13:57
 * @Author:NANDI_GUO
 */
import java.util.*;

public class hj15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int ip = in.nextInt();
        String bin = Integer.toBinaryString(ip);
        int count=0;
        for (int i = 0; i < bin.length(); i++) {
            if(bin.charAt(i) == '1'){
                count++;
            }
        }
        System.out.println(count);
    }
}
