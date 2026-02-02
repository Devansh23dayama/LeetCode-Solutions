class Solution {
    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        int max = 0;
        for (String sa : words)
            max = Math.max(max, sa.length());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            StringBuilder sb = new StringBuilder();

            for (String word : words) {
                if (i < word.length()) {
                    sb.append(word.charAt(i));
                } else {
                    sb.append(" ");
                }
            }
            list.add(sb.toString().replaceAll("\\s+$", ""));
        }

        return list;
    }
}
