class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";

        int[] targetFreq = new int[128];
        for (char c : t.toCharArray()) {
            targetFreq[c]++;
        }

        int left = 0, right = 0, minLen = Integer.MAX_VALUE, start = 0;
        int count = t.length();

        while (right < s.length()) {
            if (targetFreq[s.charAt(right)] > 0) {
                count--;
            }
            targetFreq[s.charAt(right)]--;
            right++;

            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                targetFreq[s.charAt(left)]++;
                if (targetFreq[s.charAt(left)] > 0) {
                    count++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}