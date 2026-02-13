class Solution {
    public int firstMissingPositive(int[] nums) {
        // for(int i = 1;i<=100000;i++){
        //     boolean flag = false ;
        //      for(int j =0;j<nums.length;j++){
        //         if(nums[j]==i){
        //             flag =true;
        //             break;
        //         }
        //      }
        //      if(!flag){
        //         return i;
        //      }
        // }
        // return 100001;
        Arrays.sort(nums);
        int n = 1;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==n){
                n++;
            }
            
        }
        return n;
    }
}