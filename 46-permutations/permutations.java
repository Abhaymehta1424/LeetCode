class Solution {
    public void recursion(int[] nums,List<List<Integer>> res,List<Integer> temp,int[] valid){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(valid[i] == 0){
                valid[i]=1;
                temp.add(nums[i]);
                recursion(nums, res,temp, valid);
                valid[i]=0;
                temp.remove(temp.size()-1);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int[] valid =new int[nums.length];
        recursion(nums, res, temp,valid);
        return res;
    }
}