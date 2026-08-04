Input
5
1 2 2 3 4
5
2 2 3 5 6
Output
2 3
=========================

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
	   Set<Integer> set=new LinkedHashSet<>();
	   for(int i=0;i<arr1.length;i++){
	       for(int j=0;j<arr2.length;j++){
	           if(arr1[i]==arr2[j]){
	                  set.add(arr1[i]);
	           }
	       }
	   }if(set.isEmpty()){
	       System.out.print("element not found");
	       
	   }else{
	       for(int num:set){
	       System.out.print(num+" ");
	   }}
	   
	       
	 
	   
	    
	}
}
