class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length()-1;


        
        while(i>=0){
            //remove all trailing spaces 
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            //check value at i 
            if(i<0) break;

            int j = i ;

            //find Starting index of word 
            while(j>=0 && s.charAt(j)!=' '){
                j--;
            }

            //jaise hi j agar space wale index pe aaye to ruk jayega ,jo word aaya h usse apend karke builder me dalo 
            ans.append(s.substring(j+1,i+1));

            // remove Faltu ke space where j is standing and add a space to ans 
            while(j>=0 && s.charAt(j)==' '){
                j--;
            }
            if(j>=0){
                ans.append(' ');
            }
            //place i at j 
            i=j;


        }
        return ans.toString();
    }
}