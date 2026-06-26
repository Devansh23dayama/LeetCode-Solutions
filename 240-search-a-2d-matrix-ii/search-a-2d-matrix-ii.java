class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
          int start=0;
          int last=arr[0].length-1;
            while(start < arr.length && last >= 0 ){
                if(arr[start][last]==target) return true;
                else if (arr[start][last]>target) last--;
                else start++;
            }
        
        return false;
      
    }
}