class Solution {
    public int digits(int n){
        int digit_count = 0;
        while(n>0){
            digit_count++;
            n = n/10;
        }
        return digit_count;
    }

    public int findNumbers(int[] nums) {
       int even_count = 0;
       int n = nums.length;

       for(int i=0; i<n ; i++){
        if(digits(nums[i]) % 2 == 0){
            even_count++;
        }
       }
    
        return even_count;
    }
}