class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for(int i : nums){
            if(i % 2 == 0 ){
                set.add(i);
            }else{
                set.add(i*2);
            }
        }
        int ans = Integer.MAX_VALUE;
        while(true){
            int val = set.last();

            ans = Math.min(ans, set.last() - set.first());

            if(val % 2 == 0){
                // val /= 2;
                set.remove(val);
                set.add(val/2);
            }else{
                break;
            }
        }
        return ans;
    }
}