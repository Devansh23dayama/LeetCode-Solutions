class Solution {
    public void rotate(int[][] arr) {
        int rowlength = arr.length;
        int collength = arr[0].length;

        for (int row = 0; row < rowlength; row++) {
            for (int col = row + 1; col < collength; col++) {
                int temp = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = temp;
            }
        }
        for (int row = 0; row < arr.length; row++) {
            int startCol = 0;
            int endCol = rowlength - 1;
            while (startCol <= endCol) {
              int temp= arr[row][startCol];
               arr[row][startCol]=arr[row][endCol];
               arr[row][endCol]=temp;
                startCol++;
                endCol--;
            }
        }
    }
}