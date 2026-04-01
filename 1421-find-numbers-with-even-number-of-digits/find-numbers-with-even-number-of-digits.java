class Solution {

    public int findNumbers(int[] nums) {
        int masterCount = 0;//even no 
        for (int n : nums) {
            if(n<0){
                n=n*-1;
            }
            int count = 0;// digits
            while (n > 0) {
                count++;
                n = n / 10;
            }
            if (count % 2 == 0) {
                masterCount++;
            }
        }
        return masterCount;
    }
}