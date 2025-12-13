class Solution {
    public void sortColors(int[] nums) {
     int red= 0;
     int white = 0;
     int blue = 0;
      

      for (int i = 0;i<nums.length;i++){
        if(nums[i]==0){
            red++;
        }
        if(nums[i]==1){
            white++;
        }
        if(nums[i]==2){
            blue++;
        }
      }
        int k=0;
        for(int i=0; i<red;i++){
            nums[k]=0;
            k++;
        }
        for(int i =0;i<white;i++){
            nums[k]=1;
            k++;
        }
        for(int i =0;i<blue;i++){
            nums[k]=2;
            k++;
        }
      
    }
}