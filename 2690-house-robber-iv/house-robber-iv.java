class Solution {
    public int minCapability(int[] nums, int k) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int n : nums) {
            low = Math.min(low, n);
            high = Math.max(high, n);
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canRob(nums, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low ; 
    }
    private boolean canRob(int[] nums, int k, int cap) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= cap) {
                count++;
                i++;
            }
        }
        return count >= k;
    }
}