class Solution {
    public int compress(char[] chars) {
       int i = 0; 
       int up =0;
       int n= chars.length;

      while(i<n){
        int j= i+1;
        while(j<n && chars[j]==chars[i]) j++;

        chars[up]= chars[i];
        up++;
        int cnt = j-i;
        if(cnt >1){
            for(char ch : String.valueOf(cnt).toCharArray()){
                chars[up]=ch;
                up++;
            }
        }
        i=j;//iise taki vo dusre char ki value pe aa jaye 
      }
return up;
    }
}