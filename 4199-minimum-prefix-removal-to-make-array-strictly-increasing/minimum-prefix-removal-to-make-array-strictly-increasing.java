class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n = nums.length;
        int lastViolation = -1;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                lastViolation = i;
            }
        }

        return lastViolation + 1;
    }
}
