class Solution {
    static boolean compareFreq(int[] count1,int[] count2){
       for(int i = 0 ; i< 26; i++){
        if(count1[i] != count2[i]) return false ;
      
       }
         return true;
    }
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length()){
            return false; 
        }
        int count1[] = new int[26];
        for(int i = 0; i<s1.length();i++){
            char ch = s1.charAt(i);
            count1[ch-'a']++;

        }int winlen= s1.length();
        int count2[]= new int[26];
        for(int i = 0; i<winlen;i++){
            char ch = s2.charAt(i);
            count2[ch-'a']++;
        }
        if(compareFreq(count1,count2)==true){
            return true ;

        }
    
            //if both thr freq table is not maching 
            //process remaining Window 
            int i = s1.length();
            while(i<s2.length()){
                //new Window par move karo ,new char ko table me add karo 
                char newchar= s2.charAt(i);
                count2[newchar-'a']++; 
                //old char ki entry ko tablke se remove karo
                int oldcharindex = i - winlen;
                char oldchar = s2.charAt(oldcharindex);
                count2[oldchar-'a']--;
                //apke pass updated table aa gaya h 
                if(compareFreq(count1,count2)== true) return true ; 
                //loop inc 
                i++;

            
        }
        return false;
    }
}