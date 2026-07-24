class Solution {
    public int findNumbers(int[] nums) {
       int even_count = 0;

       for(int num : nums){
        // number of digits = (int) Math.log10(num) + 1; 
        if(((int) Math.log10(num) + 1) % 2 == 0){
            even_count++;
        }
       }
    
        return even_count;
    }
}