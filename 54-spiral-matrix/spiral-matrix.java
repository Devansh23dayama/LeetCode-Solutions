class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        //m coloum, n-row
        List<Integer> result = new ArrayList<>();
        int startRow = 0;
        int endRow = row - 1;
        int startCol = 0;
        int endCol = col - 1;

        while (startRow <= endRow && startCol <= endCol) {
            //Rowwise left to right means StartCol se endCol in row 
            for (int m = startCol; m <= endCol; m++) {
                result.add(arr[startRow][m]);
            }
            startRow++;
            // Col top to bottom means starting Row to ending Row 
            for (int m = startRow; m <= endRow; m++) {
                result.add(arr[m][endCol]);
            }
            endCol--;
            if(startRow<=endRow){
            //RowWide Risght to left end Row p[rint ] end Col se start col 
            for(int m = endCol;m>=startCol;m--){
                result.add(arr[endRow][m]);
            }
            endRow--;
            }
            //Col wise bottom to top startingCol print from ending row to start Row 
            if(startCol<=endCol){
            for(int m=endRow; m>=startRow;m-- ){
                result.add(arr[m][startCol]);
            }
            startCol++;
            }
        }
        return result;
    }
}