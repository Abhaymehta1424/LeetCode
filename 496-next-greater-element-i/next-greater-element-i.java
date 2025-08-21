class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] a = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            int x = nums1[i];
            boolean found = false;
            a[i] = -1; 
            
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == x) {
                    for (int y = j + 1; y < nums2.length; y++) {
                        if (nums2[y] > x) {
                            a[i] = nums2[y];
                            break;
                        }
                    }
                    break;
                }
            }
        }
        
        return a;
    }
}