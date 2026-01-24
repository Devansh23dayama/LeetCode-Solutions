class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int temp = k ; 
        for(int i = 0 ;i< nums.length; i ++){
            if(temp>0){
                pq.add(nums[i]);
                temp--;
            }
            else{
                if(pq.peek()<nums[i]){
                    pq.poll();
                    pq.add(nums[i]);
                }
            }
        }
        return pq.peek();
        
    }
}