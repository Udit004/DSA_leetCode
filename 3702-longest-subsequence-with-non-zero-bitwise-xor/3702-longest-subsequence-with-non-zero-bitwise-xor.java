class Solution {
    public int longestSubsequence(int[] nums) {

        int xor = 0;
        boolean hasNotZero = false;

        for (int num : nums) {
            xor = xor ^ num;

            if (num != 0) {
                hasNotZero = true;
            }
        }

        if (xor != 0) {
            return nums.length;
        }

        if (hasNotZero) {
            return nums.length - 1;
        }
        return 0;
    }
}