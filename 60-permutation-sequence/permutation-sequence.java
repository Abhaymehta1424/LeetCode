import java.util.*;
class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        k--; // make k zero-based

        // Brute-force next_permutation k times
        while (k > 0) {
            nextPermutation(nums);
            k--;
        }

        // Build answer string
        StringBuilder ans = new StringBuilder();
        for (int num : nums) {
            ans.append(num);
        }
        return ans.toString();
    }
    private void nextPermutation(List<Integer> nums) {
        int i = nums.size() - 2;
        while (i >= 0 && nums.get(i) >= nums.get(i + 1)) {
            i--;
        }
        if (i >= 0) {
            int j = nums.size() - 1;
            while (nums.get(j) <= nums.get(i)) {
                j--;
            }
            Collections.swap(nums, i, j);
        }
        Collections.reverse(nums.subList(i + 1, nums.size()));
    }
}