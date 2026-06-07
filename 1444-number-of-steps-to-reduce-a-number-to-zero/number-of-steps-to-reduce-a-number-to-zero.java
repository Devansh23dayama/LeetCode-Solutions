class Solution {
    static int step(int num , int steps ){
        if(num==0) return steps;
        if(num%2==0){
             return step(num/2,steps+1);
        }
        else{
             return step( num-1,steps+1);
        }
    }

    public int numberOfSteps(int num) {
       return  step(num, 0);
    }
}