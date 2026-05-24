class Solution {
    public int findDuplicate(int[] nums) {
    HashMap<Integer,Integer> freq = new HashMap<>();
    for(int n : nums){
        freq.put(n,freq.getOrDefault(n,0)+1);
    }
    for(int i : nums){
        if(freq.get(i)>1){
            return i ;
        }
    }
    return -1;
}}