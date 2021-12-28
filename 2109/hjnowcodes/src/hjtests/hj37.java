package hjtests;

/**
 * @Date:2021/12/28 15:05
 * @Author:NANDI_GUO
 */
import java.util.*;
public class hj37 {
    public static void main(String[] args) {
        int num  = 5;
        int res = rab(num);
        System.out.println(res);
    }

    private static int rab(int num) {
        if (num < 3){
            return 1;
        }else{
            return num/3 + rab(num/3);
        }
    }
}
