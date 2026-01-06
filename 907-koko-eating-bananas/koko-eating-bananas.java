class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        for (int p : piles) {
            high = Math.max(high, p);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (check(piles, h, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static boolean check(int[] piles, int h, int k) {
        int hours = 0;

        for (int p : piles) {
            hours += (p + k - 1) / k;
        }

        return hours <= h;
    }
}
