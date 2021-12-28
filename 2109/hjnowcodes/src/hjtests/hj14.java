package hjtests; /**
 * @Date:2021/12/28 12:56
 * @Author:NANDI_GUO
 */
import java.util.*;
public class hj14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int arrlength = in.nextInt();
        String arr[] = new String[arrlength];
        for(int i = 0; i < arrlength; i++){
            arr[i] = in.next();
        }

        Arrays.sort(arr);
        for(String e: arr){
            System.out.println(e);
        }
    }
}
