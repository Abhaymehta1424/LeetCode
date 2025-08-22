class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack = new Stack<>();
        int[] a = new int[temp.length];
        for(int i=0;i<temp.length;i++){
            while(!stack.isEmpty() && temp[i] >  temp[stack.peek()]){
                int idx = stack.pop();
                a[idx] =  i - idx;
            }
            stack.push(i);
        }
        return a;
    }
}