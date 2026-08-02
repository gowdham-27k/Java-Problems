
Input 1
6
1 -2 3 -4 5 -6
Output 1
-2 -4 -6 1 5 3
================================

import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}


		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}

		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
}
