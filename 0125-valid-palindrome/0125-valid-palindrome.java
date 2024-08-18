class Solution {
    public boolean isPalindrome(String s) {
        String cleanedSentence = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        int left = 0;
        int right = cleanedSentence.length() - 1;
        
        while(left < right){
            char first = cleanedSentence.charAt(left);
            char last = cleanedSentence.charAt(right);
            
            if(first != last) return false;
            left++;
            right--;
        }
        
        return true;
            
        
     /* 
        String cleanedSentence = s.toLowerCase().replaceAll("[^a-zA-Z]", "");

        StringBuilder result = new StringBuilder();
        for (char c : cleanedSentence.toCharArray()) {
            if (c != ' ') {
                result.append(c);
            }
        }

        String original = result.toString();
        String reversed = result.reverse().toString();

        return original.equals(reversed); 
        */
    }
}