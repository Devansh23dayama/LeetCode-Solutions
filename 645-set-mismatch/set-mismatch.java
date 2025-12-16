class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
      int n =  nums.length;
      int Actual= n*(n+1)/2;
      int duplicate=0;
      int sum=0;
      int newarr[]= new int[2];
      for(int i = 0 ; i<n; i++){
        sum+=nums[i];
        if(i<n-1 && nums[i]==nums[i+1]){
          duplicate=nums[i+1];
        }
      }
      int Unique=sum-duplicate;
      int ans=Actual-Unique;
      newarr[0]=duplicate;
      newarr[1]=ans;
      return newarr;
    }
}