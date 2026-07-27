class Solution {

    //Helper
    public void getAllSubset(int[] nums, List<Integer> ans, int i, List<List<Integer>> allSubset ){

        if(i == nums.length){
            allSubset.add(new ArrayList<> (ans) );
            return;
        }

        //include
        ans.add(nums[i]);
        getAllSubset(nums, ans, i+1, allSubset);

        ans.remove(ans.size()-1);

        //skipping duplicate
        int idx = i+1;  
        while( idx < nums.length && nums[idx] == nums[idx-1]){
            idx++;
        }

        //Exclude
        getAllSubset(nums, ans, idx, allSubset);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> allSubset = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);

        getAllSubset(nums, ans, 0, allSubset);

        return allSubset;        
    }
}