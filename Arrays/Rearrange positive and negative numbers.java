Input
1 2 3 -4 -5
Output
1 -4 2 -5 3
===================================================
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[]= {1, 2, -3, -4, 5, -6,7,8,9};
		ArrayList<Integer> pos=new ArrayList<>();
		ArrayList<Integer> neg=new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0) {
				pos.add(arr[i]);
			}
			else {
				neg.add(arr[i]);
			}
		}
		 int i = 0;

        while (i < pos.size() && i < neg.size()) {
            System.out.print(pos.get(i) + " ");
            System.out.print(neg.get(i) + " ");
            i++;
        }

        while (i < pos.size()) {
            System.out.print(pos.get(i++) + " ");
        }

        while (i < neg.size()) {
            System.out.print(neg.get(i++) + " ");
        }
=======================================================
		//  for(int i=0;i<Math.min(a.size(),b.size());i++){
		//      System.out.print(a.get(i)+" ");
		//      System.out.print(b.get(i)+" ");
		//  }

		// 		}int a1=a.size();
		// 		int b1=b.size();
		// 		int c1=a1+b1;
		// 		int c[]=new int[c1];
		// 		int in=0;
		// 		for(int i=0;i<a1;i++){
		// 		    c[in++]=a.get(i);
		// 		    c[in++]=b.get(i);
		// 		}
		// 		for(int h:c){
		// 		    System.out.print(h+" ");
		// 		}
	}
}
