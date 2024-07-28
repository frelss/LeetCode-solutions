class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int counter = 0;
        for(var hour : hours){
            if(hour >= target) counter++;
        }

        return counter;
    }
}