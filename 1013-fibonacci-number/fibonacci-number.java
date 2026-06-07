class Solution {
    public int fib(int n) {
        // base case
        if (n == 1 || n == 0)
            return n;
        //recursive case 
        int ans=fib(n - 1) + fib(n - 2);
        return ans;

    }
}