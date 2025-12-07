class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum= 0;
        int max= Integer.MIN_VALUE;
        for(int i = 0; i<nums.length;i++){
            currentSum += nums[i];
            if(currentSum>max){
                max=currentSum;
            }
             if(currentSum<0){
                currentSum=0;
            }
         

        }
        return max;
    }
}