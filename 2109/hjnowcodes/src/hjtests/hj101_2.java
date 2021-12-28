package hjtests;

import java.util.*;
/**
 * @Date:2021/12/27 15:40
 * @Author:NANDI_GUO
 */
public class hj101_2 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        int length = Integer.valueOf(in.nextLine());
        int length = 8;
        String in = "1 2 4 9 3 55 64 25";
        int id = 0;

        String[] arr = in.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < (length); i++){
            list.add(Integer.valueOf(arr[i]));
        }
        Collections.sort(list, null);
        if (id == 0){
            for (Integer e: list){
                System.out.print(e+" ");
            }
        }else {
            for (int i = list.size()-1; i>=0; i--){
                System.out.print(list.get(i)+" ");
            }
        }
    }
}
