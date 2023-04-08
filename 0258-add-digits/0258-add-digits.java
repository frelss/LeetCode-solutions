class Solution {
    public int addDigits(int num) {

        String numStr = Integer.toString(num); // átalakítjuk a számot String-é
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) { 
            char c = numStr.charAt(i);
            int digit = Character.getNumericValue(c); //karakter szamma
            sum += digit;
        }
        
        while (sum >= 10) { // ha az összeg több számjegyű
            numStr = Integer.toString(sum);
            sum = 0;
            for (int i = 0; i < numStr.length(); i++) {
                char c = numStr.charAt(i);
                int digit = Character.getNumericValue(c);
                sum += digit;
            }
        }
        return sum;
    }
    
}