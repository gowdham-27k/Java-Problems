
Input 2
4
10 20 30 40
4
20 40 50 60
Output 2
20 40


import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int arr1[]={10,20,30};
	    int arr2[]={40,20,10};
	    boolean found=false;
	    for(int i=0;i<arr1.length;i++){
	        for(int j=0;j<arr2.length;j++){
	            if(arr1[i]==arr2[j]){
	                found=true;
	                System.out.print(arr1[i]+" ");
	            }
	        }
	    }
	    if(!found){
	        System.out.print("Element not found");
	    }
	    
	}
}
