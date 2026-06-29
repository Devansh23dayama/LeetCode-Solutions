class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][] = new int[n][n];

        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int num = 1;
        while(top<=bottom && left<=right){
        for (int j = left; j <= right; j++) {
            arr[top][j] = num;
            num++;
        }
        top++;
        for (int i = top; i <= bottom; i++) {
            arr[i][right] = num;
            num++;
        }
        right--;
        if (top <= bottom) {
            for (int j = right; j >= left; j--) {
                arr[bottom][j] = num;
                num++;
            }
            bottom--;
        }
        if (left <= right) {
            for (int i = bottom; i >= top; i--) {
                arr[i][left] = num;
                num++;
            }
            left++;
        }
        }
        return arr;

    }
}
