class Solution {
    public int maxSubArray(int[] nums) {
        int currSum= nums[0];
        int Maxsum=Integer.MIN_VALUE;
        if(Maxsum<0){
            Maxsum=nums[0];
        }
        for(int i = 1; i<nums.length;i++){
            currSum=Math.max(nums[i],currSum+nums[i]);
            Maxsum= Math.max(Maxsum,currSum);
        }
    return Maxsum;
        
    }
}