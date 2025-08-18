// class Solution {
//     public int buttonWithLongestTime(int[][] events) {
//         int max = 0;
//         int pichla_time = 0;
//         int butt = 0;

//         for(int i=0;i<events.length;i++){
//             int abhi_vala_butt = events[i][0];
//             int abhi_time = events[i][1];

//             int diff = abhi_time - pichla_time;

//             if(diff > max || (diff == max && abhi_vala_butt > butt)){
//                 max = diff;
//                 butt = abhi_vala_butt;
//             }
//             pichla_time = abhi_time;
//         }
//         return butt;
//     }
// }

class Solution{

    public int buttonWithLongestTime(int[][] events) {
        int ans = 0, time = 0, last = 0;
        for(int[] event: events) {
            int diff = event[1]-last;
            if(diff > time) {
                time = diff;
                ans = event[0];
            } else if(diff == time) {
                ans = Math.min(ans, event[0]);
            }
            last = event[1];
        }
        return ans;
    }
}