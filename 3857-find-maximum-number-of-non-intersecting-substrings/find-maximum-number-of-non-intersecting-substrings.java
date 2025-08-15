class Solution {
    public int maxSubstrings(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count =0;

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(map.containsKey(ch)){
                int d = i - map.get(ch) + 1;
                if(d>=4){
                    count++;
                    map.clear();
                }
            }else{
                map.put(ch,i);
            }
        }
        return count;
    }
}