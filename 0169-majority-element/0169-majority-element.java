class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, maj = 0;
        for (int num : nums) {
            if (count == 0) {
                maj = num;
            }
            if (num == maj) {
                count++;
            } else {
                count--;
            }
        }
        return maj;
    }
}
