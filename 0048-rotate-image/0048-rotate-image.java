class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0; i<n; i++){
            reverse(matrix[i]);
        }
    }

    private void reverse(int[] row){
        int left = 0;
        int right = row.length - 1;

        while(left < right){
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;

            left++;
            right--;
        }
    }
}