class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n <= 3) return false; // Cannot form a trionic array

        // Try all possible positions for p and q
        for (int i = 1; i <= n - 3; i++) {
            for (int j = i + 1; j <= n - 2; j++) {
                boolean f1 = false, f2 = false, f3 = false;

                // Check strictly increasing from 0 to i
                for (int k = 0; k < i; k++) {
                    if (nums[k] < nums[k + 1]) {
                        f1 = true;
                    } else {
                        f1 = false;
                        break;
                    }
                }
                if (!f1) continue;

                // Check strictly decreasing from i to j
                for (int k = i; k < j; k++) {
                    if (nums[k] > nums[k + 1]) {
                        f2 = true;
                    } else {
                        f2 = false;
                        break;
                    }
                }
                if (!f2) continue;

                // Check strictly increasing from j to n-1
                for (int k = j; k < n - 1; k++) {
                    if (nums[k] < nums[k + 1]) {
                        f3 = true;
                    } else {
                        f3 = false;
                        break;
                    }
                }
                if (!f3) continue;

                // If all three conditions are satisfied
                if (f1 && f2 && f3) return true;
            }
        }

        return false;
    }
}