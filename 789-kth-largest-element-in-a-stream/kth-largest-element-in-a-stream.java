class KthLargest {
    private int k;
    PriorityQueue <Integer> pq = new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int i : nums){
            pq.add(i);
            // if(pq.size() > k){
            //     pq.poll();
            // }
        }
    }
    
    public int add(int val) {
        pq.add(val);
        // pq.poll();
        while(pq.size() > k){
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */