class Solution {
    public int smallestRangeII(int[] nums, int k) {
        int n = nums.length;
        if (n == 1) return 0; // Only one element, range is zero

        Arrays.sort(nums); // Step 1: Sort the array

        // Step 2: Initial range without any change
        int result = nums[n - 1] - nums[0];

        // Step 3: Try splitting the array into two parts
        for (int i = 0; i < n - 1; i++) {
            int high = Math.max(nums[n - 1] - k, nums[i] + k); // new max
            int low = Math.min(nums[0] + k, nums[i + 1] - k);  // new min
            result = Math.min(result, high - low); // update the result
        }

        return result;
    }
}