class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0, n = nums.length,count =0,maxi=-1;
        for(int r = 0; r<nums.length;r++){
            if(nums[r]==0) count++;
             while(count>1){
                if(nums[l]==0){
                    count--;
                }
                l++;
             }
    maxi= Math.max(maxi,r-l);

        }
        return maxi;
    }
}