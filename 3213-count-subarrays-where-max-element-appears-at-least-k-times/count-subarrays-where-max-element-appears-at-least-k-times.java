class Solution 
{
    public long countSubarrays(int[] nums, int k) 
    {
        // Step 1: Find the maximum value in the array
        int maxVal = Integer.MIN_VALUE;
        for (int num : nums) 
        {
            maxVal = Math.max(maxVal, num);
        }

        long result = 0;
        int left = 0;
        int countMax = 0;

        // Step 2: Start sliding window
        for (int right = 0; right < nums.length; right++) 
        {
            // Step 3: Track count of maxVal in window
            if (nums[right] == maxVal) 
            {
                countMax++;
            }

            // Step 4: Shrink window until countMax < k
            while (countMax >= k) 
            {
                if (nums[left] == maxVal) 
                {
                    countMax--;
                }
                left++;
            }

            // Step 5: Add valid subarrays ending at 'right'
            result += left;
        }

        return result;
    }
}