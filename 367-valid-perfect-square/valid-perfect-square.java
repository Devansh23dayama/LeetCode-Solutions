class Solution {
    public boolean isPerfectSquare(int num) {
    //     int odd = 1;
    //   while(num>0){
    //     num-=odd;
    //     odd+=2;
    //   }
    //   return num==0;

     long min =1;
    long max =num;
   if(num==1) return true;
    while(min<=max){
       
        long mid =min+(max-min)/2;
         long sq=mid*mid;
        if(sq==num)return true;
        else if(mid*mid<num)min=mid+1;
        else max=mid-1;
    }
return false;
    }
}
