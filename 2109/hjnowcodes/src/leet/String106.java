package leet;

import java.util.HashSet;
import java.util.Set;

/**
 * @Date:2022/1/8 15:47
 * @Author:NANDI_GUO
 */
public class String106 {
    public static void main(String[] args) {
        String str = "aabcccccaaa";
        compressString(str);
    }
    public static void compressString(String S) {
        int count = 1;
        String temp = "";
        char l = S.charAt(0);
        for (int i = 1; i < S.length(); i++) {
            if(l == S.charAt(i)){
                count++;
            }else {
                temp += String.valueOf(l) + count;
                l = S.charAt(i);
                count = 1;
            }
        }
        //temp += String.valueOf(l) + count;
        System.out.println(temp);
    }
}
