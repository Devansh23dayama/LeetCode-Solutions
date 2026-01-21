class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int j = 0; 
        int cost =0; 
        int length = 0;
        for(int i =0;i<s.length();i++){
            cost += Math.abs(s.charAt(i)-t.charAt(i));
            while(cost > maxCost){
                cost-=Math.abs(s.charAt(j)-t.charAt(j));
                j++;
            }
            length= Math.max(length,i-j+1);
        }
         
       return length;
    }
}
