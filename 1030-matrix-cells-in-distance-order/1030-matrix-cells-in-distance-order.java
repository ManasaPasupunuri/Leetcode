import java.util.*;
class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int total = rows * cols;
        int[][] result = new int[total][2];
        int index = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                result[index][0] = r;
                result[index][1] = c;
                index++;
            }
        }
        Arrays.sort(result, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                int distA = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
                int distB = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
                return distA - distB;
            }
        });

        return result;
    }
}
