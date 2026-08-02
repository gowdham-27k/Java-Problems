import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       int oddcount=0;
       int evencount=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>=0){
               oddcount++;
           }
           else evencount++;
       }System.out.println("positive: "+oddcount);
       System.out.println("negative: "+evencount);
    }
}
Input 1
5
10 -5 20 -15 30
Output 1
Positive = 3
Negative = 2
