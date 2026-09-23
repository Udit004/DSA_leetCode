class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0;

        for (int num : nums) {
            total += num;
        }

        int target = total - x;

        if (target == 0) {
            return nums.length;
        }

        if (target < 0) {
            return -1;
        }

        int l = 0;
        int sum = 0;
        int maxLength = -1;

        for (int r = 0; r < nums.length; r++) {

            sum += nums[r];

            while (sum > target && l <= r) {
                sum -= nums[l];
                l++;
            }

            if (sum == target) {
                maxLength = Math.max(maxLength, r - l + 1);
            }
        }

        if (maxLength == -1) {
            return -1;
        }

        return nums.length - maxLength;
    }
}