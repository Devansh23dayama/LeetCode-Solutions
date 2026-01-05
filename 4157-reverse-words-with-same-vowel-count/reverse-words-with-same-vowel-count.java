class Solution {
    public String reverseWords(String s) {
        String str[] = s.split(" ");
        int prev = 0;
        String naya = "";

        // Count vowels in first word
        for (int i = 0; i < str[0].length(); i++) {
            char ch = str[0].charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                prev++;
        }

        // Add first word
        naya += str[0] + " ";

        // Process remaining words
        for (int j = 1; j < str.length; j++) {
            int curr = 0;

            for (int i = 0; i < str[j].length(); i++) {
                char ch = str[j].charAt(i);
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    curr++;
            }

            if (curr == prev) {
                String rev = "";
                for (int i = str[j].length() - 1; i >= 0; i--) {
                    rev += str[j].charAt(i);
                }
                naya += rev + " ";
            } else {
                naya += str[j] + " ";
            }
        }

        return naya.trim();
    }
}
