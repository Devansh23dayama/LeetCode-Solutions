class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       Arrays.sort(nums);
       ArrayList<Integer> al = new ArrayList<Integer>();
            

        for(int i = 1; i<nums.length; i++){
        
            if(nums[i]==nums[i-1]){
                al.add(nums[i]);
                
            }
        }
        return al;
        
    }
}