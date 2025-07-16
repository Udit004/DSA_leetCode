class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0 ){
            return result;
        }

        Map<Character, String> PhoneMap = new HashMap<>();
        PhoneMap.put('2', "abc");
        PhoneMap.put('3', "def");
        PhoneMap.put('4', "ghi");
        PhoneMap.put('5', "jkl");
        PhoneMap.put('6', "mno");
        PhoneMap.put('7', "pqrs");
        PhoneMap.put('8', "tuv");
        PhoneMap.put('9', "wxyz");

        backtrack(result, PhoneMap, digits, 0, new StringBuilder());
        return result;
    }

private void backtrack(List<String> result, Map<Character, String> phoneMap,
                           String digits, int index, StringBuilder current) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String possibleLetters = phoneMap.get(digits.charAt(index));
        for (char letter : possibleLetters.toCharArray()) {
            current.append(letter);
            backtrack(result, phoneMap, digits, index + 1, current); 
            current.deleteCharAt(current.length() - 1); 
        }
    }}