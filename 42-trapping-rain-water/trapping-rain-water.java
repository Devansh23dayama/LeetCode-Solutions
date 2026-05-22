class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int[] prefix =new int[arr.length];
        int[] suffix =new int[arr.length];
        int storage= 0;


        prefix[0]=arr[0];
        for(int i =1; i<n;i++){
            prefix[i]=Math.max(prefix[i-1],arr[i]);
        }
        suffix[n-1]=arr[n-1];
        for(int i =n-2;i>=0;i--){
            suffix[i]=Math.max(suffix[i+1],arr[i]);
        }
        for(int i = 0;i<n;i++){
           
            storage+= Math.min(prefix[i],suffix[i])-arr[i];
          
        }
       return storage;
    }
}