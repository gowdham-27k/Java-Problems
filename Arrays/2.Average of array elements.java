import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       int count=0;
       for(int i=0;i<arr.length;i++){
           count+=arr[i];
       }System.out.print(count/arr.length);
    }
}

Sum = 10 + 20 + 30 + 40 + 50 = 150
Number of elements = 5
Average = 150 / 5 = 30.0
