class Solution {
    public boolean doesAliceWin(String s) {
        Set<Character> vowelset = Set.of('a','e','i','o','u');
        int count = 0;

        for(char ch : s.toCharArray()){
            if(vowelset.contains(ch)){
                count++;
            }
        }
        // if(count == 1){
        //     return true;
        // }
        // if(count == 0 ){
        //     return false;
        // }
        
        // if(count % 2 != 0 || count % 2 == 0){
        //     return true;
        // }
        
        return count > 0;
    }
}