Input

arr1 = 1 2 3 4 5
arr2 = 3 4 5 6 7

Output

1 2 3 4 5 6 7
===========================
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int arr1[]=new int[a];
	    for(int i=0;i<a;i++){
	        arr1[i]=sc.nextInt();
	    }
	    
	       int b=sc.nextInt();
	    int arr2[]=new int[b];
	    for(int i=0;i<b;i++){
	        arr2[i]=sc.nextInt();
	    }
	    int a1=arr1.length;
	    int b1=arr2.length;
	    int c=a1+b1;
	    int c1[]=new int [c];
	    System.arraycopy(arr1,0,c1,0,a1);
	    System.arraycopy(arr2,0,c1,a1,b1);
	   
	        Set<Integer> set=new LinkedHashSet<>();
	         for(int num:c1){
	             set.add(num);
	         }
	         for(int u:set){
	             System.out.print(" "+u);
	         }
	       
	 
	   
	    
	}
}
