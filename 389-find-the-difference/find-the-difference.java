class Solution {
    public char findTheDifference(String s, String t) {
     char ans=0;
      for(char c: s.toCharArray()){
        ans= (char)(ans^c);
      }
      for(char c:t.toCharArray()){
        ans=(char)(ans^c);
      }

        return ans;
    }


}