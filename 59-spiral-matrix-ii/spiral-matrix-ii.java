class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]= new int[n][n];
        //m coloum, n-row
        int num = 1;
        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = n- 1;

        while (startRow <= endRow && startCol <= endCol) {
            //Rowwise left to right means StartCol se endCol in row 
            for (int m = startCol; m <= endCol; m++) {
                arr[startRow][m] = num++;
            }
            startRow++;
            // Col top to bottom means starting Row to ending Row 
            for (int m = startRow; m <= endRow; m++) {
                arr[m][endCol] = num++;
            }
            endCol--;
            if (startRow <= endRow) {
                //RowWide Risght to left end Row print end Col se start col 
                for (int m = endCol; m >= startCol; m--) {
                    arr[endRow][m] = num++;
                }
                endRow--;
            }
            //Col wise bottom to top startingCol print from ending row to start Row 
            if (startCol <= endCol) {
                for (int m = endRow; m >= startRow; m--) {
                    arr[m][startCol] = num++;
                }
                startCol++;
            }
        }
        return arr;
    }
}