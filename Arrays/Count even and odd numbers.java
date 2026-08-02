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
           if(arr[i]%2==0){
               oddcount++;
           }
           else evencount++;
       }System.out.println("even: "+oddcount);
       System.out.println("odd: "+evencount);
    }
}

Input 1
5
10 15 20 25 30
Output 1
Even = 3
Odd = 2
