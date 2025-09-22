class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];

        for(int num : nums){
            freq[num]++;
        }

        int max = 0;

        for(int i : freq){
            max = Math.max(i, max);
        }

        int res = 0;

        for(int i : freq ){
            if(i == max){
                res += i;
            }
        }
        return res;
    }
}