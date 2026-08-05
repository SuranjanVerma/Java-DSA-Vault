class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int n = nums.length;
        int count = 0;
        int maxOne = 0;

        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                count++;
                maxOne = Math.max(count, maxOne);
            }
            else{
                count = 0;
            }
        }
        return maxOne;
    }
}