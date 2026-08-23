class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        int left = 0;
        double avg = 0;
        double maxAvg = 0;
        double sum = 0;

        for(int right = 0; right<k; right++){
            sum = sum+nums[right];
        }
        avg = sum/k;
        for(int j = k; j<n; j++){
            sum = sum + nums[j];
            sum = sum - nums[j-k];
            avg = Math.max(avg,sum/k);
        }

        return avg;        
    }
}