class Solution {
    public int findNumbers(int[] nums) {
       int even_count = 0;

       for(int num : nums){
        int digits = ( (int) Math.log10(num) + 1) % 10; 
        if(digits % 2 == 0){
            even_count++;
        }
       }
    
        return even_count;
    }
}