class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int newarr[] =new int[2];
        int n = numbers.length;
        int i= 0;
        int j = n-1;
        while (i<=j){
            if(numbers[i]+numbers[j]==target){
                newarr[0]=i+1;
                newarr[1]=j+1;
                return newarr;
            }
            else if(numbers[i]+numbers[j]>target){
                j--;
            
            }
            else{
                i++;
            }
        }
        return newarr;
    }
}