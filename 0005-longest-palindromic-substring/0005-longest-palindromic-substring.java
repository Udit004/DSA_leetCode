class Solution {
    public String longestPalindrome(String s) {
        if( s == null || s.length() < 0) return "";

        int start = 0,end = 0;

        for(int i = 0; i< s.length(); i++){
            int l1 = Center(s, i, i);
            int l2 = Center(s, i, i+1);
            int maxLen = Math.max(l1,l2);

            if(maxLen > end - start){
                start = i - (maxLen - 1)/2;
                end = i + maxLen/2;
            }
        }

        return s.substring(start, end + 1);
    }


    private int Center(String s, int left, int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}