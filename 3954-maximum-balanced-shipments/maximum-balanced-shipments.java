class Solution {
    public int maxBalancedShipments(int[] weight) {
        
        int count = 0;
        int a = 0;
        int n = weight.length-1;

        for(int i = 0;i<weight.length;i++){
                    
            if(weight[i] >= a){
                a = weight[i];
            }else{
                count++;
                a = 0;
            }
        }
        return count;
    }
}