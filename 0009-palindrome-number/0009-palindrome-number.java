class Solution {
    //Helper
    public int reverse(int n){
        int rev = 0;
        while(n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }
    public boolean isPalindrome(int x) {
        if(reverse(x) == x){
            return true;
        }
        return false;        
    }
}