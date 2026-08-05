Input 1
6
16 17 4 3 5 2
Output 1
17 5 2
=========================================
public class Main
{
	public static void main(String[] args) {
		int arr[]={16, 17, 4 ,3, 5 ,2};
		for(int i=0;i<arr.length;i++){
		    boolean found=true;
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[i]<arr[j]){
		            found=false;
		            
		        }
		    }if(found){
		        System.out.print(arr[i]+" ");
		    }
		}
	}
}
