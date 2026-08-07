
Input
12345
Output
15
=========================
class Main {
    public static void main(String[] args) {
        int n=12349898;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.print(sum);
    }
}
