class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        int l = 0;
        int r = nums.length;

        int mid = (l+r) / 2;

        return nums[mid];

    }
}