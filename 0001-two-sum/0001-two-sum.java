class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[][] numsWithIndex = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            numsWithIndex[i][0] = nums[i];
            numsWithIndex[i][1] = i; 
        }

        Arrays.sort(numsWithIndex , (a,b) -> Integer.compare(a[0],b[0]));

        int i = 0;
        int j = nums.length-1;

        while(i<j){

            int sum = numsWithIndex[i][0] + numsWithIndex[j][0];

            if(sum == target){
               return new int[] { numsWithIndex[i][1], numsWithIndex[j][1] };
            }
            if(sum > target){
                j--;
            }
            else{
                i++;
            } 
        }

        return new int[]{};
        
    }
}