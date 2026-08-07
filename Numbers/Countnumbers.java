Input
987654
Output
6
class Main {
    public static void main(String[] args) {
        int n=1234567;
        int count=0;
        String s=String.valueOf(n);
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            count++;
        }
   System.out.print(count);
    }
}
