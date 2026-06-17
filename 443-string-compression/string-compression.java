class Solution {
    public int compress(char[] chars) {
        int i = 0, ansIdx = 0, n = chars.length;

        while(i < n){
            int j = i+1;

            while(j < n && chars[j] == chars[i]){
                j++;
            }

            chars[ansIdx++] = chars[i];

            int cnt = j - i;

            if(cnt > 1){
                for(char ch : String.valueOf(cnt).toCharArray()){
                    chars[ansIdx++] = ch;
                }
            }

            i = j;
        }

        return ansIdx;
    }
}