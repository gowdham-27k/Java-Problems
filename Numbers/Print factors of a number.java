Input:

9

Output:

1 3 9

public class Main
{
	public static void main(String[] args) {
		int n=50;
		for(int i=1;i<=n;i++){
		    if(n%i==0){
		        System.out.print(i+" ");
		    }
		}
	}
}
