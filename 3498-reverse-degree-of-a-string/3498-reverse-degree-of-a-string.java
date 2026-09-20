class Solution {
    public int reverseDegree(String s) {

        int length = s.length();
        int ans = 0;

        for (int i = 0; i < length; i++) {

            int val = 123 - s.charAt(i);

            ans += (val * (i + 1));

        }
        return ans;
    }
}