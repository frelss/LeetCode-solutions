class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> count = new HashMap<>();
       
        for(String str : strs){
            char[] sortString = str.toCharArray();  
            Arrays.sort(sortString);                   
            String sorted = new String(sortString);
            
            if(!count.containsKey(sorted)) {
                count.put(sorted, new ArrayList<>());
            }
            
            count.get(sorted).add(str);
        }
        return new ArrayList<>(count.values());
    }
}