class Solution {
    public boolean isPalindrome(String s) {
        String news = "";
        s=  s.toLowerCase();
        for(int i = 0 ; i<s.length();i++){
            if(s.charAt(i)>='a'&& s.charAt(i)<='z'|| s.charAt(i)>='0' && s.charAt(i)<='9'){
            news += s.charAt(i);
            }
        }
            String rev="";
       for(int i=news.length()-1;i>=0;i--){
           rev+= news.charAt(i);
       }

        if(news.equals(rev)){
            return true;
        }
       return false; 
    }
}
