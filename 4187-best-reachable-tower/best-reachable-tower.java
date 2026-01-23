import java.util.*;

class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {

      
        Arrays.sort(towers, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        int x1 = -1, y1 = -1, qf = -1;
        int c1 = center[0], c2 = center[1];

        for (int i = 0; i < towers.length; i++) {

            int d = Math.abs(towers[i][0] - c1)
                  + Math.abs(towers[i][1] - c2);

            if (d <= radius && towers[i][2] > qf) {
                x1 = towers[i][0];
                y1 = towers[i][1];
                qf = towers[i][2];
            }
        }

        return new int[]{x1, y1};
    }
}
