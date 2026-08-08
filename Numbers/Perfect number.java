import java.util.*;
public class Main {
    public static void main(String[] args) {
       int n=6;
       int i=1;
       int sum=0;
       while(i<=n){
           if(sum==n){
               System.out.print("perfect number");
               return;
           }
           sum+=i;
           i++;
       } System.out.print("Not a perfect");
       
        }
}
