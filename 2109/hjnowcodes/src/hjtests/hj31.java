package hjtests;

import java.util.*;
import java.util.regex.*;

/**
 * @Date:2021/12/28 13:33
 * @Author:NANDI_GUO
 */
public class hj31 {
    public static void main(String[] args) {
        String test = "I am a boy";

        char[] ch = test.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                sb.append(ch[i]);
            }else{
                sb.append(" ");
            }
        }
        String[] arr = sb.toString().split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
