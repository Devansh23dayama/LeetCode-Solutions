class Solution {
    public int thirdMax(int[] nums) {
 Arrays.sort(nums);
 int distinct = 1;
 int n = nums.length;
 int max= nums[nums.length-1];
 for(int i = nums.length-2;i>=0;i--){
    if(nums[i]!=nums[i+1]){
        distinct++;
        if(distinct==3){
            max=nums[i];
        }
    }
     
    }
    return max;
    }
}
