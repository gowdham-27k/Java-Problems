Input 3
6
2 4 1 7 5 9
Output 3
8
=========================

public class Main
{
	public static void main(String[] args) {
		int arr[]={2 ,4 ,1 ,7, 5 ,9};
		int min=arr[0];
		int max=0;
		for(int i=1;i<arr.length;i++){
		    if(arr[i]<min){
		        min=arr[i];
		    }
		    int profit=arr[i]-min;
		    if(profit>max){
		        max=profit;
		    }
		}System.out.print(max);
	}
}
