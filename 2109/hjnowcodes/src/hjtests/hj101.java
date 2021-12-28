package hjtests;

import java.util.*;

/**
 * @Date:2021/12/27 14:53
 * @Author:NANDI_GUO
 */
public class hj101 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        int length = Integer.valueOf(in.nextLine());
        int length = 8;
        String in = "1 2 4 9 3 55 64 25";
        int id = 1;

        String[] arr = in.split(" ");
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        for (int i = 0; i < (length); i++){
            treeSet.add(Integer.valueOf(arr[i]));
        }
        Iterator<Integer> it =
                (id==1?(((TreeSet)treeSet.descendingSet())):treeSet)
                        .iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
