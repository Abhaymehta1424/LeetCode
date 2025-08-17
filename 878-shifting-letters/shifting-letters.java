class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;

        int total = 0;
        char[] a = s.toCharArray();

        for(int i=n-1;i>=0;i--){
            total = (total + shifts[i]) % 26;
            a[i] = (char) ((a[i] - 'a' + total) % 26 + 'a');
        }
        return new String(a);
    }
}