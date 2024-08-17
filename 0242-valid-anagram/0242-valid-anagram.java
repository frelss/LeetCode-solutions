class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        HashMap<Character, Integer> string1 = new HashMap<>();
        HashMap<Character, Integer> string2 = new HashMap<>();
        
        char[] word1 = s.toCharArray();
        char[] word2 = t.toCharArray();
        
       for (Character wordOne : word1) {
            string1.put(wordOne, string1.getOrDefault(wordOne, 0) + 1);
        }
        
        for (Character wordTwo : word2) {
            string2.put(wordTwo, string2.getOrDefault(wordTwo, 0) + 1);
        }
        
        for (char i : string1.keySet()) {
            if (!string2.containsKey(i) || !string1.get(i).equals(string2.get(i))) {
                return false;
            }
        }
        return true;
    }
}