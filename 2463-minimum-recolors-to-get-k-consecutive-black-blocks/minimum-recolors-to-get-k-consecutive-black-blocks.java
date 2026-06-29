class Solution {
    public int minimumRecolors(String blocks, int k) {

        int count = 0;
         for(int i = 0 ; i<k ; i++){
            if(blocks.charAt(i)=='W'){
                count++;
            }
         }
         int ans = count ;
        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i - k) == 'W') {
                count--;
            }
            if (blocks.charAt(i) == 'W') {
                count++;
            }
            ans = Math.min(ans, count);
        }
        
        return ans;
    }
}