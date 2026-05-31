class Solution {
    public int[][] transpose(int[][] arr) {
        int rowlength = arr.length;
        int collength = arr[0].length;
        int[][] newarr = new int[collength][rowlength];

        for (int row = 0; row < rowlength; row++) {
            for (int col = 0; col < collength; col++) {
                newarr[col][row] = arr[row][col];
            }

        }
        return newarr;
    }
}