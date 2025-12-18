class Solution {
    public int majorityElement(int[] nums) {
           //   Arrays.sort(nums);
    //   int l = nums.length;
    //     int res = nums[l/2];
    //     return res;

    int cand =nums[0];
    int count = 0;

    for (int i = 0;i<nums.length;i++){
        if(cand==nums[i]){
         count++;
        }
        else{
            count --;
        }
        if(count==0){
            cand=nums[i];
            count=1;
        }
    }
    return cand;
    }
}