class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = 0;
        count += numBottles;

        while(numBottles >= numExchange){
            int rem = numBottles % numExchange;
            int qe = numBottles / numExchange;

            numBottles = qe + rem;
            
            count += qe;

        }


        return count;
    }
}