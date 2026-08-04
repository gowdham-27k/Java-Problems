Input
5
2 2 1 2 3
Output
2
===============
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0; i<a; i++) {
			arr[i]=sc.nextInt();
		}
		boolean found=false;
		int count=0;
		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
				if(arr[i]==arr[j]) {

					count++;
				}
			}
			if(count>a/2) {
				System.out.print(arr[i]);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.print("not");
		}




	}
}
