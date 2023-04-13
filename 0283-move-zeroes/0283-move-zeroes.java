class Solution {
    public void moveZeroes(int[] nums) {

        int nzi = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int tmp = nums[nzi];
                nums[nzi] = nums[i];
                nums[i] = tmp;
                nzi++;
            }
        }    
    }
}