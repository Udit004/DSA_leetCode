class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int left = j + 1;
                int right = n - 1;
                long remaining = (long) target - nums[i] - nums[j];
                while (left < right) {
                    long sum = (long) nums[left] + nums[right];
                    if (sum == remaining) {
                        List<Integer> value = new ArrayList<>();
                        value.add(nums[i]);
                        value.add(nums[j]);
                        value.add(nums[left]);
                        value.add(nums[right]);
                        result.add(value);
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;
                    }
                    if (sum < remaining) {
                        left++;
                    }
                    if (sum > remaining) {
                        right--;
                    }
                }
            }
        }

        return result;
    }
}