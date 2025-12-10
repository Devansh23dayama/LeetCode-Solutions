class Solution {
    public boolean isAnagram(String s, String t) {
        char news[] = s.toCharArray();
        char newt[] = t.toCharArray();
        Arrays.sort(news);
        Arrays.sort(newt);
        return Arrays.equals(news,newt);
    //     int l1= news.length;
    //     int l2= newt.length;
    //     if(l1!=l2){
    //         break;}
           

    // else{
        
    //         for(int i=0;i<l1;i++){
    //              if(news[i]!=newt[i])
    //              return false;
    //         }
    // }
    //      return true;  
    //     }
        
    }
}