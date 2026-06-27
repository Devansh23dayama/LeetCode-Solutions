class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int wsum=0;
        int maxi= Integer.MIN_VALUE;
      while(right<nums.length){
        wsum+=nums[right];// expansion 
        right++;
        if(right-left +1 > k ){
            maxi=Math.max(maxi,wsum);
            wsum -= nums[left];//contract
            left++;
        }
      }  
        return (double)maxi / k;
    }
}