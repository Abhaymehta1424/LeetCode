// class Solution {
//     public int maximumUniqueSubarray(int[] nums) {
//         // int i = 0;
//         int sum = 0;
//         int max = 0;
//         HashMap <Integer, Integer> map = new HashMap<>();

//         for(int num : nums){
//             map.put(num, map.getOrDefault(num , 0) + 1);
//         }

//         for(int i =0;i<nums.length;i++){
//             for(int freq : map.keySet()){
//                 if(freq == 1){
//                     sum += nums[i];
//                     max = Math.max(max, sum);
//                 }else{
//                     i++;
//                 }
//             }
//         }
//         return max;
//     }
// }


class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int left = 0, right = 0;
        int sum = 0, max = 0;

        while (right < nums.length) {
            if (!set.contains(nums[right])) {
                sum += nums[right];
                set.add(nums[right]);
                max = Math.max(max, sum);
                right++;
            } else {
                sum -= nums[left];
                set.remove(nums[left]);
                left++;
            }
        }
        return max;
    }
}