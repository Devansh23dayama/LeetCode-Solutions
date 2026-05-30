class Solution {
    public int maximumWealth(int[][] arr) {
  
    List<Integer> list = new ArrayList<Integer>();
    int rowlength=arr.length;
    int collength=arr[0].length;

    for(int i = 0; i<rowlength;i++){
        int sum = 0;
        for(int j = 0;j<collength;j++){
            sum+=arr[i][j];
        }
        list.add(sum);
    }
   int max =  list.stream().max(Integer::compareTo).get();
   return max;
    }
}