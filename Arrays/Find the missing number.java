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
	    int max=arr[0];
	    for(int i=0;i<a;i++){
	        max=Math.max(arr[i],max);
	    }
	    int count=0;
	    for(int i=0;i<a;i++){
	        count+=arr[i];
	    }
	    int miss=max*(max+1)/2;
	    int find=miss-count;
	    System.out.print("the missing number is "+find);
	}
}
