Input 2
5
2 3 4 5 6
Output 2
360 240 180 144 120
=====================
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int arr[]=new int[a];
	    for(int i=0;i<a;i++){
	        arr[i]=sc.nextInt();
	    }	    
	  for(int i=0;i<arr.length;i++){
	      int prod=1;
	      for(int j=0;j<arr.length;j++){
	          if(i!=j){
	              prod*=arr[j];
	          }
	      }System.out.print(prod+" ");
	  }  
	}
}
