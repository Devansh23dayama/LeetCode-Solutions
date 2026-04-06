class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       HashMap<Integer,Integer> hm = new HashMap<>();
       List<Integer> re= new ArrayList<>();
       for(int n:nums){
        hm.put(n,hm.getOrDefault(n,0)+1);
       }
       for(int k : hm.keySet()){
        if(hm.get(k)==2){
            re.add(k);
        }
       }
       return re;
    }
}