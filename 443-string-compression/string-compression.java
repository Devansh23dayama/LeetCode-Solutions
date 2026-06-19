class Solution {
    public int compress(char[] chars) {
        int i = 0, up = 0, n = chars.length;

        while (i < n) {
            int j = i + 1; // this pointer will help to count same consecutive characters

            while (j < n && chars[j] == chars[i])
                j++;

            chars[up] = chars[i];
            up++;

            int cnt = j - i;
            if (cnt > 1) {
                for (char ch : String.valueOf(cnt).toCharArray()) {
                    chars[up] = ch;
                    up++;
                }
            }

            i = j; // putting i pointer on j i.e. from where the new character starts
        }
        return up;

    }
}