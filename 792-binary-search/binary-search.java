class Solution {
    static int solve(int arr[],int target,int s , int e){
        //bc 
        if(s>e){
            return -1;
        }
        //solving 1 step then pass to recussion 
        int mid = s +(e-s)/2;
        if(arr[mid]==target) return mid ;
        if(arr[mid]<target) s= mid +1;
        if(arr[mid]>target) e= mid -1;
        //rc
       return solve(arr,target,s,e);
        
    }
    public int search(int[] arr, int target) {
        int s =0;
        int e = arr.length-1;
        int ans=  solve(arr,target,s,e);
        return ans;
    }
}