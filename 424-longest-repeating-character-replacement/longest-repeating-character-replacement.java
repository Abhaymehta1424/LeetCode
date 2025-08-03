class Solution {
    public int characterReplacement(String s, int k) {
        int[] map = new int[26];
        int left = 0;
        int window= 0;
        int max_freq = 0;

        for(int right =0;right<s.length();right++){
            map[s.charAt(right)-'A']++;

            max_freq = Math.max(max_freq, map[s.charAt(right)-'A']);

            int window_length = right - left +1;

            if(window_length - max_freq >k){
                map[s.charAt(left)-'A']--;
                left++;
            }
            window_length= right-left+1;
            window= Math.max(window, window_length);
        }
        return window;
    }
}