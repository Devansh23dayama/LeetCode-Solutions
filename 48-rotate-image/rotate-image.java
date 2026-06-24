class Solution {
    public void rotate(int[][] arr) {
        int rowlength= arr.length;
        int collength=arr[0].length;
      for(int row = 0; row <rowlength;row++){
        for(int col = row+1; col<collength;col++){
            int temp = arr[row][col];
            arr[row][col]=arr[col][row];
            arr[col][row]=temp;
        }
      }
      for(int row =0;row<rowlength;row++){
        int start= 0;
        int last =arr[row].length-1;
        while(start<last){
            int temp=arr[row][start];
            arr[row][start]=arr[row][last];
            arr[row][last]=temp;
            start++;
            last--;
        }
      }
         

    }
}