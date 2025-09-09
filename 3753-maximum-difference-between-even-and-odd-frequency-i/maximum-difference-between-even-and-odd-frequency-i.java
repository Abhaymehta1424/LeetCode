class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int freq : map.values()){
            if(freq % 2 != 0){
                max = Math.max(freq, max);
            }
            if(freq % 2 == 0){
                min = Math.min(freq, min);
            }
        }
        return max - min;
    }
}