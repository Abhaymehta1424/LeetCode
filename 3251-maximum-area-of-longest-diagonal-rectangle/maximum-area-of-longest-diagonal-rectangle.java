class Solution {
    public int areaOfMaxDiagonal(int[][] nums) {
        int n = nums.length;
        int maxArea = 0;
        int maxDiag = 0;
        for(int i=0; i<n ;i++ ){
            int l = nums[i][0];
            int b = nums[i][1];

            int diag = (l * l) + (b * b);
            int area = l * b;

            if(diag > maxDiag || (diag == maxDiag && area > maxArea)){
                maxArea = area;
                maxDiag = diag;
            }
        }
        return maxArea;
    }
}