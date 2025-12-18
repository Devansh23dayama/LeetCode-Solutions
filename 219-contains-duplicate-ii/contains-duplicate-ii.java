class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         // for(int i = 0; i< nums.length;i++){
        //     for(int j = nums.length-1;j>=i+1;j--){
        //         if(nums[i]==nums[j]){
        //             if(Math.abs(i-j)<=k){
        //                 return true;
        //             }
        //         }
        //     }
        // }
        // return false;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i= 0; i< nums.length;i++){

            if(map.containsKey(nums[i])){
                int index= map.get(nums[i]);
                if(i-index<=k){
                    return true;
                }
            }
            map.put(nums[i],i);

        }
        return false;

    }
}