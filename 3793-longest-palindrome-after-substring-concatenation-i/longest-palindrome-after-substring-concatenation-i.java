// class Solution {
//     public int longestPalindrome(String s, String t) {
//         int max = 0;
//         for(int i=0;i<s.length();i++){
//             for(int j=0;j<t.length();j++){
//                 String combine = s.substring(i) + t.substring(0, j+1);
//                 if(isPalin(combine)){
//                     max = Math.max(max, combine.length());
//                 }
//             }
//         }
//         return max;
//     }
//     public boolean isPalin(String s){
//         int j = s.length()-1;
//         int i = 0;
//         while(i<j){
//             if(s.charAt(i) != s.charAt(j)){
//                 return false;
//             }else{
//                 i++;
//                 j--;
//             }
//         }
//         return true;
//     }
// }

class Solution {
    public int longestPalindrome(String s, String t) {
        int maxLen = 0;
        int n = s.length();
        int m = t.length();

        // Check all substrings from s and t
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String subS = s.substring(i, j + 1);
                for (int k = 0; k < m; k++) {
                    for (int l = k; l < m; l++) {
                        String subT = t.substring(k, l + 1);
                        String combined = subS + subT;
                        if (isPalindrome(combined)) {
                            maxLen = Math.max(maxLen, combined.length());
                        }
                    }
                }
            }
        }

        // Also check substrings from s alone
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String subS = s.substring(i, j + 1);
                if (isPalindrome(subS)) {
                    maxLen = Math.max(maxLen, subS.length());
                }
            }
        }

        // Also check substrings from t alone
        for (int i = 0; i < m; i++) {
            for (int j = i; j < m; j++) {
                String subT = t.substring(i, j + 1);
                if (isPalindrome(subT)) {
                    maxLen = Math.max(maxLen, subT.length());
                }
            }
        }

        return maxLen;
    }

    private boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}