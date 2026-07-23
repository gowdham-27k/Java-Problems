class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        String a=new StringBuilder(s).reverse().toString();
        if(a.equals(s)){
            return true;
        }return false;
    }
}