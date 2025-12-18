class Solution {
    public int majorityElement(int[] nums) {
      Arrays.sort(nums);
      int l = nums.length;
        int res = nums[l/2];
        return res;
    }
}