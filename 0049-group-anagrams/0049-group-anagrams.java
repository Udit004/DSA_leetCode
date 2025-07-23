class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> Map = new HashMap<>();

        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(!Map.containsKey(sorted)){
                Map.put(sorted, new ArrayList<>());
            }
            Map.get(sorted).add(str);

        }

        return new ArrayList<>(Map.values());
    }
}