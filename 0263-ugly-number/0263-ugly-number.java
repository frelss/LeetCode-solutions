class Solution {
    public boolean isUgly(int n) {

        if (n <= 0) {
            return false; // A 0 és a negatív számok nem Ugly számok
        }

       int[] div = {2, 3, 5};

       for(int d : div){
           while(n % d == 0){
               n /= d; //Osztjuk amig lehet
           }
       }
        return n == 1; // Ha a szám végül 1 lesz, akkor az Ugly szám
    }
}