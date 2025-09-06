class Solution {
    public long distributeCandies(int n, int limit) {
        int min = Math.min(n, limit);
        long res = 0;
        for(int i=0;i<=min;i++){
            if(n - i <= 2 *limit){
                res += Math.min(n - i, limit) - Math.max(0, n - i - limit) + 1;
            }
        }
        return res;
    }
}