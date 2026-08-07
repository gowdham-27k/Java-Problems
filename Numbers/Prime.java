
class Main {
    public static void main(String[] args) {
       int n=8;
       boolean prime=true;
       if(n<=1){
           prime=false;
       }
       else{
           for(int i=2;i<n;i++){
               if(n%i==0){
                   prime=false;
                   break;
               }
           }
       }
       if(prime){
           System.out.print(n+" prime");
       }
       else{
           System.out.print(n+" not a prime");
       }
    }
}
