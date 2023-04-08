class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> sum = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            Integer ci = sum.get(nums[i]);
            if(ci != null){
                return new int[]{i, ci};
            } 
            sum.put(target - nums[i], i);          
        }
        return nums;
    }
}