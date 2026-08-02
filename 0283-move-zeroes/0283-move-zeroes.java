class Solution {
    // Helper
    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void moveZeroes(int[] nums) {

        int n = nums.length;
        int l = 0;
        int r = 1;
        while(r<n){
            if(nums[l] != 0){
                l++;
                r++;
            }
            else if(nums[l] == 0 && nums[r] !=0){
                swap(nums, l,r);
                l++;
                r++;
            }
            else{
                r++;
            }
        }
        
    }
}