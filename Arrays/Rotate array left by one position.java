import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]={1,2,3,4,5};
		int k=2;
		rotate(arr,k);
	    System.out.print(Arrays.toString(arr));

	}
	public static void rotate(int[] arr,int k){
	    reverse(arr,k,arr.length-1);
	    reverse(arr,0,arr.length-1);
	    reverse(arr,0,k-1);
	    
	}
	
	public static void reverse(int []arr,int l,int r){
	    while(l<r){
	        int temp=arr[l];
	        arr[l]=arr[r];
	        arr[r]=temp;
	        r--;
	        l++;
	    }
	}
}
