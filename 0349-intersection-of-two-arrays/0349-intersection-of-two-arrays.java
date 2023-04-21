class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        // set1-be elso tomb elemei
        for (int num : nums1) set1.add(num);
            
        // set2-be masodik tomb elemei
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : nums2)set2.add(num);
        
        // eltavolitjuk a set1-ben szereplok kozul azokat, amelyek nincsenek set2-ben
        set1.retainAll(set2);
        
        // visszaadjuk az eredményt tomb formajaban
        int[] result = new int[set1.size()];
        int i = 0;
        for (int num : set1) result[i++] = num;
        return result;
    }
}
