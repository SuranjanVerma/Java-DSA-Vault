class Solution {

    //Helper
    public void getAllPermute(int[] nums, List<List<Integer>> ans, int idx){
        //Base Case
        if(idx==nums.length){
            ArrayList<Integer> currentPermute = new ArrayList<>();
            for(int num : nums){
                currentPermute.add(num);
            }
            ans.add(currentPermute);
            return;
        }

        for(int i = idx; i<nums.length; i++){
            swap(nums, idx, i);
            getAllPermute(nums, ans, idx+1);
            swap(nums, idx, i); //Backtrack
        }
    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        getAllPermute(nums, ans, 0);

        return ans;
        
    }
}