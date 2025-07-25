class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrace(0,nums,new ArrayList<>(),result);
        return result;
    }

    private void backtrace(int start, int[] nums, List<Integer> current, List<List<Integer>> result){
        result.add(new ArrayList<>(current));

        for(int i=start; i<nums.length; i++){
            current.add(nums[i]);
            backtrace(i+1,nums,current,result);
            current.remove(current.size()-1);
        }
    }
}