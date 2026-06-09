class Solution {
    static void f(int nums[], int i , List<Integer> temp, List<List<Integer>> ans ){
        //Base Case
        if(i==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        //inclusion 
        temp.add(nums[i]);
        f(nums,i+1,temp,ans);
        //backtracking
        temp.remove(temp.size()-1); 
        //remove duplicates
        while(i+1<nums.length && nums[i]==nums[i+1]) i++;
        //Exclusion
        f(nums,i+1,temp,ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        f(nums,0,temp,ans);
        return ans ;

        
    }
}