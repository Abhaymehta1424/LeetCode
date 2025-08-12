class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        int intial =0;

        for(int num : set){
            if(!set.contains(num - 1)){
                int length = 0;    
                while(set.contains(num + length)){
                    length++;
                }
                intial = Math.max(length, intial);
            }
        }
        return intial;
    }

}