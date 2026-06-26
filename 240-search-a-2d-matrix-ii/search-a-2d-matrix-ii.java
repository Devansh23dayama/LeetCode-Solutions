class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int rowlength=arr.length;
        int collength=arr[0].length;

        for(int row=0;row<rowlength;row++){
            int start=0;
            int last=collength-1;
            while(start<=last){
                int mid = start + (last - start) / 2;
                if(arr[row][mid]==target) return true;
                else if (arr[row][mid]>target) last=mid -1;
                else start =mid+1;
            }
        }
        return false;
        
    }
}