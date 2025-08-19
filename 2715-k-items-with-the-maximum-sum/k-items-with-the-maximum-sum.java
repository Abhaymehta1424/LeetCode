class Solution {
    public int kItemsWithMaximumSum(int one, int zero, int neg, int k) {
        if(one >= k){
            return k;
        }else if( one + zero >= k){
            return one;
        }else if(one + zero + neg >= k){
            int a = one + zero;
            int b = k - a;
            return one - b;
        }
        return 0;
    }
}