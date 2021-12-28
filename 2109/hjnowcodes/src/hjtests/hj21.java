package hjtests;

import java.util.*;
public class hj21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Character> map = new HashMap<>();
        map.put("abc",'2');
        map.put("def",'3');
        map.put("ghi",'4');
        map.put("jkl",'5');
        map.put("mno",'6');
        map.put("pqrs",'7');
        map.put("tuv",'8');
        map.put("wxyz",'9');
        Set<String> keys = map.keySet();
                                                //Map用来存键值对, set存的是键
        while(sc.hasNext()){
            String pd = sc.nextLine();
            char[] cs = pd.toCharArray();       //转成char数组便于修改值
            for(int i = 0; i<cs.length; i++){   //遍历char数组
                if(cs[i] >= '0' && cs[i] <= '9'){
                    cs[i] = cs[i];              //如果是正整数, 值不变
                }else if (cs[i]>='A' && cs[i]<='Y'){ //ASCII常识
                    cs[i] = (char)(cs[i]+32+1); //如果是大写字母,+32转小写,+1到下一个字母
                }else if(cs[i]=='Z'){           //如果是Z,变成a就行了
                    cs[i] ='a';
                }else{                          //else判断的都是小写字母了
                    for(String e: keys){        //遍历set, 每个e都是一个键
                        if (e.contains(String.valueOf(cs[i]))){
                            cs[i] = map.get(e); //如果e中包含该小写字母
                        }                       //将该字母换成e对应的值
                    }
                }
            }
            for(char ele: cs){System.out.print(ele);} //遍历输出cs数组元素
        }
    }
}
