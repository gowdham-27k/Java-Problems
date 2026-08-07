Input
153
Output
Armstrong Number
===================
class Main {
    public static void main(String[] args) {
       int n=153;
       int temp=n;
       int s=String.valueOf(temp).length();
       
       int count=0;
       while(temp>0){
           int digit=temp%10;
           count+=(int) Math.pow(digit,s);
           temp=temp/10;
       }
      
        if(count==n){
            System.out.print("Armstrong number");
        }
        else{
            System.out.print("Not Armstrong number");
        }
    }
}
