class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int last = arr.length-1;
        int ans = -1;
        while(start<= last ){
            int mid = start +(last - start )/2;
            if(arr[mid]<arr[mid +1]){
                start = mid +1;
            }
            else{
                //arr[mid]>= arr[mid+1]
                ans = mid ;
                 last = mid - 1;
            }
        }
        return ans ;
    }
}