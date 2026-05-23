class Solution {
    public boolean isPerfectSquare(int num) {
        long start = 1;
        long last = num;

        while(start<=last){
            long mid = start+(last-start)/2;

            if(mid*mid ==num){
                return true;
            }
            else if(mid*mid>num){
                last= mid -1;
            }
            else{
                start =mid+1;
            }
           
        }
        return false;
    }
}
