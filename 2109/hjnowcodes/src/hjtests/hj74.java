package hjtests;

/**
 * @Date:2022/1/14 19:30
 * @Author:NANDI_GUO
 */
import java.util.*;

public class hj74 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            String nextLine = scanner.nextLine();

            StringBuilder stringBuilder = new StringBuilder();
            ArrayList<String> arrayList = new ArrayList();
            boolean flag = false;
            for (int i = 0; i < nextLine.length(); i++) {
                char c = nextLine.charAt(i);

                if (String.valueOf(c).equals("\"")) {
                    flag = flag ? false : true;
                    continue;
                }

                if (String.valueOf(c).equals(" ") && !flag) {

                    arrayList.add(stringBuilder.toString());
                    stringBuilder = new StringBuilder();
                } else {
                    stringBuilder.append(c);
                }

            }
            arrayList.add(stringBuilder.toString());
            System.out.println(arrayList.size());
            for (String s : arrayList) {
                System.out.println(s);
            }
    }
}

