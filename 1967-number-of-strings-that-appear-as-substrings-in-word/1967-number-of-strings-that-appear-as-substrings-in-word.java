class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ct = 0;
        int wl = word.length();
        int pl = patterns.length;
        Set<String> set = new HashSet<>();

        for(int i = 0; i < wl; i++){
            for(int j = i; j < wl; j++){
                set.add(word.substring(i, j+1));
            }
        }

        for(int i = 0; i < pl; i++){
            if(set.contains(patterns[i])) ct++;
        }
        return ct;
    }
}