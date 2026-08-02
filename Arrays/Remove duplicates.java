Input 1
6
1 2 3 2 4 1
Output 1
1 2 3 4

===================================
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
       Arrays.sort(arr);
       for(int i=0;i<arr.length;i++){
           boolean found=false;

           for(int j=i+1;j<arr.length;j++){
           if (arr[i]==arr[j]){
               found=true;
               break;
              
           }
           }
           if(!found){
                System.out.print(arr[i]);
           }
           }
         
    }
}
