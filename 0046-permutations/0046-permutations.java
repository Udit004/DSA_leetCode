class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, 0, result);
        return result;
    }

    private void backtrack(int[] nums, int index, List<List<Integer>> result){

        List<Integer> permuation = new ArrayList<>();


        if(index == nums.length){
            for(int num : nums){
                permuation.add(num);
            }
            result.add(permuation);
            return ;
        }

        for(int i=index; i<nums.length; i++){
            swap(nums, index, i);
            backtrack(nums, index+1, result);
            swap(nums, index, i);
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}