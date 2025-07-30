import java.util.*;

public class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> xIndices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                xIndices.add(i);
            }
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int k = queries[i];
            result[i] = k <= xIndices.size() ? xIndices.get(k - 1) : -1;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 7};
        int[] queries = {1, 3, 2, 4};
        int x = 1;

        int[] result = new Solution().occurrencesOfElement(nums, queries, x);
        System.out.println(Arrays.toString(result));  // Output: [0, -1, 2, -1]
    }
}
