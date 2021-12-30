package hjtests;

import java.util.*;

/**
 * @Date:2021/12/29 13:06
 * @Author:NANDI_GUO
 */
public class hj29 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(passw(str1));
        System.out.println(hack(str2));

    }
    static String passw(String str) {
        char[] ch = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]>='a' && ch[i]<'z') {
                ch[i] = (char) (ch[i]-32+1);
            }else if (ch[i]>='A' && ch[i]< 'Z'){
                ch[i] = (char) (ch[i] + 32 + 1);
            }else if(ch[i] == 'z'){
                ch[i] = 'A';
            }else if (ch[i] == 'Z'){
                ch[i] = 'a';
            }else if(!Character.isLetter(ch[i])){
                if (ch[i] == '9'){
                    ch[i] = '0';
                }else{
                    ch[i] = (char)(ch[i]+1);
                }
            }
            sb.append(ch[i]);
        }
        return sb.toString();
    }
    static String hack(String str){
        char[] ch = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]>'A' && ch[i]<='Z') {
                ch[i] = (char) (ch[i] -1 + 32);
            }else if (ch[i]>'a' && ch[i]<= 'z'){
                ch[i] = (char) (ch[i] -1 - 32);
            }else if(ch[i] == 'A'){
                ch[i] = 'z';
            }else if (ch[i] == 'a'){
                ch[i] = 'Z';
            }else if(!Character.isLetter(ch[i])){
                if (ch[i] == '0'){
                    ch[i] = '9';
                }else{
                    ch[i] = (char)(ch[i]-1);
                }
            }
            sb.append(ch[i]);
        }
        return sb.toString();
    }
}
