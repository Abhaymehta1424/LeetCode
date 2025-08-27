class Solution {
    public long countPairs(int[] nums, int k) {
        long count=0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i : nums){
            int gcd1 = Gcd(i , k);
            
            for(int gcd2 : map.keySet()){
                if((long) gcd1 * gcd2 % k == 0){
                    count += map.get(gcd2);
                }
            }
            
            map.put(gcd1, map.getOrDefault(gcd1, 0) + 1);
        }
        
        return count;
    }
    private int Gcd(int a , int b){
        while(b != 0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}