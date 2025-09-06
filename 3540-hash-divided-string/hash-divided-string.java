class Solution {
    public String stringHash(String s, int k) {
        // int n = s.length();
        // int sum = 0;
        // StringBuilder res = new StringBuilder();
        // for(int i = 0;i<n;i+=k){
        //     int a = (s.charAt(i) - 'a');
        //     sum += a;
        //     res.append((char)((sum % 26)+ 'a'));
        // }
        // return res.toString();


        StringBuilder res = new StringBuilder();

        for(int i=0;i<s.length();i+=k){
            int sum = 0;
            for(int j=i;j<i+k;j++){
                sum += s.charAt(j) - 'a';
            }
            res.append((char)(
                (sum % 26) +'a'));
        }
        return res.toString();
    }
}