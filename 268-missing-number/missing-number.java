class Solution {
    public int missingNumber(int[] nums) {
    int n = nums.length;
    int realSum=n*(n+1)/2;
    int actualSum=Arrays.stream(nums).sum();
    return realSum-actualSum;
    }
}