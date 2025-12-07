class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       Arrays.sort(nums);
       ArrayList<Integer> al = new ArrayList<Integer>();
            int duplicate= nums[0];

        for(int i = 1; i<nums.length; i++){
        
            if(nums[i]==nums[i-1]){
                al.add(nums[i]);
                duplicate= nums[i];
            }
        }
        return al;
        
    }
}