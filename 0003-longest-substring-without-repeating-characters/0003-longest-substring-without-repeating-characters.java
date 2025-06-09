class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0,right = 0;
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        for(right=0; right<s.length(); right++){
            while(!set.add(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);

        }
        return maxLength;
    }
}