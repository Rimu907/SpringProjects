package collection;

import org.junit.Test;
import java.util.*;
import java.util.regex.Pattern;

/**
 * @Date:2021/12/27 18:59
 * @Author:NANDI_GUO
 */
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        char[] c = str.toCharArray();
        char[] c2 = str2.toCharArray();

        int m = c.length; int n = c2.length;

        char[] c3 = new char[c2.length + c.length];
        for (int i = 0; i < m; i++) {
            c3[i] = c[i];
        }
        for (int i = m; i < m+n; i++) {
            c3[i] = c2[i-m];
        }
        
        Arrays.sort(c3);
        System.out.println(c3);

    }

}
