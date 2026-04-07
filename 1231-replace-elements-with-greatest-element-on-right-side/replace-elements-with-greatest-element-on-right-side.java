class Solution {
    public int[] replaceElements(int[] arr) {
        int mx= -1; 
        int n = arr.length;
        int a ;

        for(int i = n-1;i>=0;i--){
            a=arr[i];
            arr[i]=mx;
            mx=Math.max(mx,a);
        }
        return arr;
    }
}