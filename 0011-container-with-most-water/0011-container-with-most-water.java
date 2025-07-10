class Solution {
    public int maxArea(int[] height) {
        if(height.length == 0) return 0;
        int left=0,right=height.length - 1, MaxArea=0, area=0;
        while (left <= right){
            area = Math.min(height[left], height[right])*(right-left);
            if(area > MaxArea){
                MaxArea = area;
            }
            if(height[left] <= height[right]){
                left++;
            } else {
                right--;
            }
        }
        return MaxArea;
    }
}