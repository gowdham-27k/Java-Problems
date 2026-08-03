import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total=sc.nextInt();
		
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
		int c1=a+b;
		int c[]=new int[c1];
		 int index=0;
		    for(int i=0;i<a;i++){
		        c[index++]=arr1[i];
		        c[index++]=arr2[i];
		    }
	
		System.out.print(total);
		for(int num:c){
		    System.out.print(" "+num);
		}
	}
}
