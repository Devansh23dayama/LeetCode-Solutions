class Solution {
    public int countGoodSubstrings(String s) {
        int left = 0;
        int ans = 0;
        for (int right = 0; right < s.length(); right++) {
            if (right - left + 1 > 3) {
                left++;
            }
            if (right - left + 1 == 3) {

                char a = s.charAt(left);
                char b = s.charAt(left + 1);
                char c = s.charAt(left + 2);

                if (a != b && b != c && a != c) {
                    ans++;
                }
            }
        }
        return ans;
    }
}