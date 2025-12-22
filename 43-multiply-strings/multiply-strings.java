class Solution {
    public String multiply(String num1, String num2) {

        // Edge case
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int n = num1.length();
        int m = num2.length();
        int[] res = new int[n + m];

        // Multiply from right to left
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                int p1 = i + j;
                int p2 = i + j + 1;

                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + res[p2];

                res[p2] = sum % 10;
                res[p1] += sum / 10;
            }
        }

        // Build result string
        StringBuilder sb = new StringBuilder();
        for (int num : res) {
            if (sb.length() == 0 && num == 0) continue;
            sb.append(num);
        }

        return sb.toString();
    }
}
