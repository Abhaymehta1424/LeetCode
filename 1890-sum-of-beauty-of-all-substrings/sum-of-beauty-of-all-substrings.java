class Solution {
    public int beautySum(String s) {
        int sum =0;
        for(int i=0;i<s.length();i++){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j=i;j<s.length();j++){

            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch ,0)+1);
            

            int min = Integer.MAX_VALUE;
            int max = -1;

            for(int val : map.values()){
                min = Math.min(min, val);
                max = Math.max(max,val);
            }
            sum += (max-min);
            }
        }
        return sum;
    }
}