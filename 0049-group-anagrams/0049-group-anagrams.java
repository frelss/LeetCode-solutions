class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> count = new HashMap<>();
       
        for(int i = 0; i < strs.length; i++){
            char[] sortString = strs[i].toCharArray();  
            Arrays.sort(sortString);                   
            String sorted = new String(sortString);
            
            if(!count.containsKey(sorted)) {
                count.put(sorted, new ArrayList<>());
            }
            
            count.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(count.values());
    }
}