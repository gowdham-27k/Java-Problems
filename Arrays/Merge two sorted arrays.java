import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {6,7,8,9};
		int a1=arr1.length;
		int a2=arr2.length;
		int a3=a1+a2;
		int c[]=new int[a3];
		System.arraycopy(arr1,0,c,0,a1);
		System.arraycopy(arr2,0,c,a1,a2);
		System.out.print(""+Arrays.toString(c));
	}
}
