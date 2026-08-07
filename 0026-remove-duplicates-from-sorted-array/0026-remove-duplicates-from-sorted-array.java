class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int n = nums.length;

        if(n==0){
            return 0;
        }

        for(int r=1; r<n; r++){
            if(nums[l] != nums[r]){
                l++;
                nums[l] = nums[r];
            }
        }
        return l+1;
    }
}