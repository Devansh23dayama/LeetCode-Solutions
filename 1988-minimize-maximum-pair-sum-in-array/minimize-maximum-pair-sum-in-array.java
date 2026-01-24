class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int total = nums[start] + nums[end];
            if (sum < total) {
                sum = total;

            }
            start++;
            end--;

        }
        return sum;
    }
}