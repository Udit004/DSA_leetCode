class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] result = new int[n];

        arr1[0] = nums[0];
        arr2[0] = nums[1];

        int i = 1;
        int j = 1;

        for(int k=2; k<n; k++) {
            if(arr1[i-1] > arr2[j-1]) {
                arr1[i] = nums[k];
                i++;
            } else {
                arr2[j] = nums[k];
                j++;
            }
        }

        for(int a=0; a<i; a++){
            result[a] = arr1[a];
        }
        for(int b=0; b<j; b++){
            result[i+b] = arr2[b];
        }

        return result;
    }
}