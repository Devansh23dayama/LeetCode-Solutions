class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
       int l= 1 ;
        int h = n-2;
       while(l<=h){
        int mid = (l+h)/2;
         // checking from both side that it should be max 
        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
        //acending part me h 
        if(arr[mid]>arr[mid-1]) l=mid+1;
        //decending part checking 
        else h=mid-1;
       }
       return -1;
    }
}