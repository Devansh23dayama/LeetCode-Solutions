class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
          if (nums.length == 1)
                return 0;
        for(int i = 0; i<=nums.length-k;i++){
               int diff = nums[i + k - 1] - nums[i];
                min =Math.min(min,diff);
            
        }

        return min;
    }
}