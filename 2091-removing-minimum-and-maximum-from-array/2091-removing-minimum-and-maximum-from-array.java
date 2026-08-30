class Solution {
    public int minimumDeletions(int[] nums) {

        int maxPoint = 0;
        int minPoint = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > nums[maxPoint]) {
                maxPoint = i;
            }

            if (nums[i] < nums[minPoint]) {
                minPoint = i;
            }
        }

        int max = Math.max(maxPoint, minPoint);
        int min = Math.min(maxPoint, minPoint);

        int remFromLeft = max + 1;
        int remFromRight = nums.length - min;
        int checkFromBoth = (min + 1) + (nums.length - max);

        return Math.min(remFromLeft, Math.min(remFromRight, checkFromBoth));
        
    }
}