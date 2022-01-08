package leet;

import java.util.*;
import java.util.stream.Stream;

//import static com.sun.deploy.security.CertificateHostnameVerifier.hashSet;

//反转字符串中的单词
public class leet151 {

    public static void main(String[] args) {
        System.out.println(reverseWords2("  Bob    Loves  Alice   "));
    }
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        List<String> reverseWords = new ArrayList();
        for (int i = words.length-1; i >= 0; i--) {
            reverseWords.add(words[i]);
        }
        StringBuilder sb = new StringBuilder();
        reverseWords.stream()
                .filter(e -> !e.isEmpty())
                .forEach(e-> sb.append(e+ " "));
        return sb.toString().trim();
    }
    public static String reverseWords2(String s) {
        List<String> list = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(list);
        return String.join(" ", list);
    }
}
