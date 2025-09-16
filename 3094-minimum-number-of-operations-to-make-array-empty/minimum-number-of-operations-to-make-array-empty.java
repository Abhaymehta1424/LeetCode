class Solution {
    public int minOperations(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int count = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int t = entry.getValue();
            
            if(t == 1){
                return -1;
            }

            count += t / 3;
            if(t % 3 != 0){
                count++;
            }
        }
        return count;
    }
}