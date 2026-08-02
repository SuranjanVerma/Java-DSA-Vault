class Solution {
    //Helper
    public void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void sortColors(int[] nums) {

        //Duch National Flag Algorithm
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, mid, low);
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }
        }
    }
}