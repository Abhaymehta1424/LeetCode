class Solution {
    public int numSubmat(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int ans = 0;
        int[][] width = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 1){
                    if(j == 0) width[i][j] = 1;
                    else width[i][j] = width[i][j - 1] + 1;
                }
            }
        }

        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int minWidth = width[i][j];
                
                for(int k = i; k >= 0; k--){
                    if (width[k][j] == 0) break; // Agar 0 mila toh rectangle yahin khatam
                    minWidth = Math.min(minWidth, width[k][j]);
                    ans += minWidth;
                }
            }
        }
        return ans;
    }
}