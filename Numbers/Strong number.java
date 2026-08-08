import java.util.*;
public class Main {
    public static void main(String[] args) {
       
          int n=145;
          String s=Integer.toString(n);
          char ch[]=s.toCharArray();
          int count=0;
          for(char nu:ch){
             int num = Character.getNumericValue(nu);
             int result=strong(num);
             count+=result;
             
          }
          if(count==n){
              System.out.print("Strong");
          }
          else {
              System.out.print("Not Strong");
          }
        }
        public static int strong(int n){
            int res=1;
            for(int i=1;i<=n;i++){
                res*=i;
            }
            return res;
        }
    
}
