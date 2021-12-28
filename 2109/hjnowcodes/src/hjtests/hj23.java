package hjtests;

import java.util.*;

/**
 * @Date:2021/12/27 22:36
 * @Author:NANDI_GUO
 */
public class hj23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String str = sc.nextLine();
            Map<Character, Integer> map = new HashMap<>();
            for (char ch : str.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            Integer integer =
                    map.entrySet().stream().min(Comparator.comparingInt(Map.Entry::getValue)).get().getValue();

            for (Character e : str.toCharArray()) {
                if (map.get(e).equals(integer)){
                    str = str.replaceAll(String.valueOf(e),"");
                }
            }
            System.out.println(str);
        }
    }
}
