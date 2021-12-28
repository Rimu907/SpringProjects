package hjtests;

import java.io.*;
import java.util.*;

/**
 * @Date:2021/12/27 18:07
 * @Author:NANDI_GUO
 */
public class hj17 {
    public static void main(String[] args) throws IOException {
        Scanner ip = new Scanner(System.in);
        String[] in = ip.nextLine().split(";");
        int x = 0, y = 0;
        for(String s: in){
            if (!s.matches("^[WASD][0-9]{1,2}$")){
                continue;
            }
            int val = Integer.valueOf(s.substring(1));
            switch(s.charAt(0)){
                case 'A': x -= val; break;
                case 'D': x += val; break;
                case 'W': y += val; break;
                case 'S': y -= val; break;
             }
        }
        System.out.println(x+","+y);
    }
}
