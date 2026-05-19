class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // for(int i =0; i<=nums1.length-1;i++){
        //    for(int j =0;j<=nums2.length-1;j++){
        //      if(nums2[j]==nums1[i]){
        //         return nums2[j];
        //     }
        //    }
        // }
        // return -1;


        HashSet<Integer> hs =new HashSet<>();
        for(int x:nums2){
            hs.add(x);
        }
        for(int k :nums1){
           if(hs.contains(k))
           {
            return k;
           }
        }
        return -1;
    }
}