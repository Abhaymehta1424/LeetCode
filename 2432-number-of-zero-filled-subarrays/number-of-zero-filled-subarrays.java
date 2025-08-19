class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        int arr = 0;
       for(int i : nums){
            if(i == 0){
                arr++;      // i dekhenge jaab taak zero hai tab    subarrray + 1;
            }else{
                arr = 0;
            }
            count += arr;      //count = 1(count) + 2(subarray)
       }
       return count;
    }
}