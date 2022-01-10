package hjtests;
import java.util.*;
public class hj54 {
        public static void main(String[] srgs){
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                String str = sc.nextLine();
                process(str);
            }
        }

        public static void process(String str){
            String s1 = str.replace("[","(");
            String s2 = s1.replace("]",")");
            String s3 = s2.replace("{","(");
            String s4 = s3.replace("}",")");
            int res = solve(s4);
            System.out.println(res);
        }

        public static int solve(String s){
            if(s==null||s.length()==0) return 0;
            Stack<Integer> stack = new Stack<>();
            char[] chs = s.toCharArray();
            int len = s.length(), number=0;
            char sign = '+';
            for(int i=0;i<len;i++){
                char c = chs[i];
                if(c==' ') continue;
                if(Character.isDigit(c)){
                    number = number*10 + c-'0';
                }
                if(c=='('){
                    int j=i+1, count=1;
                    while(count>0){
                        if(chs[j]==')') count--;
                        if(chs[j]=='(') count++;
                        j++;
                    }
                    number = solve(s.substring(i+1,j-1));
                    i=j-1;
                }
                if(!Character.isDigit(c)||i==len-1){
                    if(sign=='+'){
                        stack.push(number);
                    }else if(sign=='-'){
                        stack.push(-1*number);
                    }else if(sign=='*'){
                        stack.push(stack.pop()*number);
                    }else if(sign=='/'){
                        stack.push(stack.pop()/number);
                    }
                    sign = c;
                    number = 0;
                }
            }
            int ans = 0;
            while(!stack.isEmpty()){
                ans += stack.pop();
            }
            return ans;
        }
}


