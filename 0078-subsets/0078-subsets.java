class Solution {

    public void getAllSubset(int[] nums , List<Integer> ans, int i, List<List<Integer>> allSubset){

        if(i == nums.length){
            allSubset.add(new ArrayList<> (ans) );
            return;
        }

        //Include
        ans.add(nums[i]);
        getAllSubset(nums, ans, i+1, allSubset);

        //Exclude
        ans.remove(ans.size()-1);
        getAllSubset(nums, ans, i+1, allSubset);
        
    }
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> allSubset = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        getAllSubset(nums, ans, 0, allSubset);

        return allSubset;
        
    }
}