class Solution {
    public int pivotIndex(int[] nums) {
        int TotalSum=0;
        int LeftSum=0;
        int RightSum=0;
       for(int i:nums){
        TotalSum+=i;
       }
       for(int i = 0 ; i<nums.length ; i++){
        RightSum = TotalSum-LeftSum-nums[i];
        if(RightSum==LeftSum){
            return i;
        }
        LeftSum+=nums[i];
       }
        return -1;
    }
}