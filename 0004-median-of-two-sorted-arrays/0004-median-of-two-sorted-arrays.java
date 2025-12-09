class Solution {
    public void merge(int[] nums1, int[] nums2, int[] merArr){
        int n = nums1.length;
        int m = nums2.length;
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(nums1[i] <= nums2[j]){
                merArr[k] = nums1[i];
                i++;
                k++;
            } else {
                merArr[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            merArr[k] = nums1[i];
            i++;
            k++;
        }
        while(j<m){
            merArr[k] = nums2[j];
            j++;
            k++;
        }
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        double median = 0;
        int[] merArr = new int[n];
        merge(nums1,nums2,merArr);
        int m = merArr.length;
        if(m%2 == 0){
            double sum = (double)(merArr[m/2] + merArr[(m/2)-1]);
            return median = sum/2.0;
        } else {
            return median = (double)(merArr[m/2]);
        }
    }
}