class Solution {
    public int strStr(String s, String t) {
        int i = 0;
        int j = 0;
        int mini = -1;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                if (j == 0) {
                    mini = i;
                }
                i++;
                j++;
                if (j == t.length())
                    return mini;
            }
            else{
                if(mini!=-1){
                    i=mini+1;
                }
                else{
                    i++;
                }
                j=0;
                mini=-1;
            }
        }

        return -1;
    }
}
