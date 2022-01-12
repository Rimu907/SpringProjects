package hjtests;

import java.util.*;

/**
 * @Date:2022/1/10 19:35
 * @Author:NANDI_GUO
 */
public class hj35 {
    public static void main(String args[]){//主方法，主要就是接收数据
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            printtriangle(num);
        }
    }

//    public static void printtriangle(int num){ //输出方法输出蛇形矩阵
//        int y=1;//列的方向第一个肯定是1
//        int yCount=1;//列由上往下是等差数列，第一行和第二行差1
//        for(int i=1;i<=num;i++){//行的循环次数
//            int x=y;//第i行的第一个数就是列的第i个数
//            int xCount=2; //可以看到第i行第一个加数刚好是i+1
//            for(int j=0;j<=num-i;j++){ //列的循环次数，每次少一列
//                System.out.print(x+" ");//循环输出x
//                x+=xCount++;    //等差数列每次+1
//            }
//            System.out.println("");//换行
//            y+=yCount++; //等差数列每次加1
//        }
//    }

    public static void printtriangle(int num){ //输出方法输出蛇形矩阵
        int y = 1;
        int yadd = 1;
        for (int i = 1; i <= num; i++) {
            int x = y;
            int xadd = i+1;
            for (int j = 0; j <= num - i; j++) {
                System.out.print(x+" ");
                x += xadd;
                xadd++;
            }
            System.out.println();
            y += yadd;
            yadd++;
        }
    }


}
