class Solution {
    static void f(int[] nums, int i, List<Integer> temp, List<List<Integer>> ans) {
        //Base Case 
        if (nums.length == i) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        //Recursive Case

        //inclusion 
        temp.add(nums[i]);

        f(nums, i + 1, temp, ans);

        //backtraking 
        temp.removeLast();
        //exclusion
        f(nums, i + 1, temp, ans);

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        f(nums, 0, temp, ans);
        return ans;
    }
}