class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int st=0;
        for(int i = 0; i < t.length() && st < s.length(); i++){
           if(s.charAt(st) == t.charAt(i)){
               st++;
           }
        }
        return st == s.length();
    }
}
