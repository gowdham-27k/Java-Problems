Input
7
Output
0 1 1 2 3 5 8

public class Main
{
	public static void main(String[] args) {
		int n=5;
	    int first=0;
	    int second=1;
	    for(int i=1;i<=n;i++){
	        System.out.print(first+" ");
	        int next=first+second;
	        first=second;
	        second=next;
	        
	    }
	}
}
