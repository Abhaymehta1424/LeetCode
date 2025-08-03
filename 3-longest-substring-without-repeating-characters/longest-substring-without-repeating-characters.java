class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max =0;
        int left =0;
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        
        while(map.get(c) > 1){
            char left_val = s.charAt(left);
            map.put(left_val, map.get(left_val) -1);
            left++;
        }
        max = Math.max(max, i - left +1);
    }
    return max;
    }
}