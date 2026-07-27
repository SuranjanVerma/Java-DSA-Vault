class Solution {

    public void getAllSubset(int[] nums , List<Integer> ans, int idx, List<List<Integer>> allSubset){

        if(idx >= nums.length){
            allSubset.add(new ArrayList<> (ans) );
            return;
        }

        ans.add(nums[idx]);
        getAllSubset(nums, ans, idx+1, allSubset);

        ans.remove(ans.size()-1);
        getAllSubset(nums, ans, idx+1, allSubset);
        
    }
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> allSubset = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        getAllSubset(nums, ans, 0, allSubset);

        return allSubset;
        
    }
}