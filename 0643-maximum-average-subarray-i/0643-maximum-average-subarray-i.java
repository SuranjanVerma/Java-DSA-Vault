class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        double sum = 0;
        double maxSum = 0;

        for(int right = 0; right<k; right++){
            sum += nums[right];
        }

        maxSum = sum;

        for(int j = k; j<n; j++){
            sum += nums[j];
            sum -=  nums[j-k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum/k;        
    }
}