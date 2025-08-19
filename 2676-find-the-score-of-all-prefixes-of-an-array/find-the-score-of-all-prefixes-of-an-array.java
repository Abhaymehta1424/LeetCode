class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        int max = 0;
        long[] a = new long[n];
        long[] res = new long[n];

        for(int i=0;i<n;i++){
            if(nums[i] > max ){
                max = nums[i];
            }
            a[i] = nums[i] + max;
            // int sum = a[0];

            // sum = sum + a[i];
        }
        res[0] = a[0];
        for(int i=1;i<n;i++){
            res[i] = res[i - 1] + a[i];
        }

        return res;
    }
}