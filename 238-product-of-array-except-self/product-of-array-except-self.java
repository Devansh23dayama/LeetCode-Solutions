class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix =new int[nums.length];
        int[] suffix =new int[nums.length];
        int[] ans= new int[nums.length];
    int n = nums.length;
        // prefix[0]=nums[0];
        // for(int i =1;i<n;i++){
        //     prefix[i]=prefix[i-1]*nums[i];
        // }
        // suffix[n-1]=nums[n-1];
        // for(int i =n-2;i>=0;i--){
        //     suffix[i]=suffix[i+1]*nums[i];
        // }
        // for(int i = 0;i<n ;i++){
        //     if(i==0){
        //        ans[i]=suffix[i+1];
        //     }
        //     else if(i==n-1){
        //         ans[i]= prefix[i-1];
        //     }
        //     else{
        //         ans[i]= suffix[i+1]*prefix[i-1];
        //     }
        // }
        // return ans;

        prefix[0]=1;
        for(int i =1;i<n;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        suffix[n-1]=1;
        for(int i =n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }
        for(int i =0;i<n;i++){
            ans[i]=suffix[i]*prefix[i];
        }
        return ans;
    }
}