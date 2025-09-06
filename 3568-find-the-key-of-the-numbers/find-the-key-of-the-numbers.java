class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int min_thousand = Math.min(num1/1000, Math.min(num2/1000, num3/1000)) * 1000;

        int min_hundred = Math.min(num1/100 % 10, Math.min(num2/100 % 10, num3/100 % 10)) * 100;

        int min_tens = Math.min(num1/10 % 10, Math.min(num2/10 % 10, num3/10 % 10)) * 10;

        int min_ones = Math.min(num1 % 10, Math.min(num2 % 10, num3 % 10));

        return min_thousand + min_hundred + min_tens + min_ones;
    }
}