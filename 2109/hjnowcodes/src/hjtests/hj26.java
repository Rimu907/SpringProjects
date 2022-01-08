package hjtests;

import org.junit.Test;

import java.util.*;

/**
 * @Date:2021/12/28 10:41
 * @Author:NANDI_GUO
 */
public class hj26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            String res = sort(str);
            System.out.println(res);
        }
    }

    public static String sort(String str){
        List<Character> letters = new ArrayList<>();
        for(char ch: str.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.add(ch);
            }
        }
        Collections.sort(letters, (o1, o2) -> Character.toLowerCase(o1)-Character.toLowerCase(o2));

        StringBuffer result = new StringBuffer();
        for (int i = 0, j = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                result.append(letters.get(j));
                j++;
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    @Test
    public void test(){
        String res = sort("By?e");
        System.out.println(res);
    }
}
