class Solution {
    public List<Integer> luckyNumbers(int[][] arr) {
        int rowlength = arr.length;
        int collength = arr[0].length;
       
       Set<Integer> minrow=new HashSet<>();
        Set<Integer> maxcol=new HashSet<>();
        //minimum
        for (int row = 0; row < rowlength; row++) {
            int min=arr[row][0];
            for (int col = 0; col < collength; col++) {
                min=Math.min(min,arr[row][col]);
            }
            minrow.add(min);
        }
        for (int col = 0; col < collength; col++) {
            int max=arr[0][col];
            for (int row = 0; row < rowlength; row++) {
                max=Math.max(max,arr[row][col]);
            }
            maxcol.add(max);
        }
        List<Integer> ans= new ArrayList<>();
           for (int num : minrow) {
            if (maxcol.contains(num)) {
                ans.add(num);
            }
        }

        return ans;
    }  
}