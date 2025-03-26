import java.util.Arrays;

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalApples = 0;

        for(int a : apple){
            totalApples += a;
        }

        Arrays.sort(capacity);

        int boxes = 0;
        int sum = 0;
        int i = capacity.length-1;
        while(i >= 0 && sum < totalApples){
            sum += capacity[i];
            boxes++;
            i--;
        }

        return boxes;
    }
}