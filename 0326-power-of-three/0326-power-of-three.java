class Solution {
    public boolean isPowerOfThree(int n) {

    // Ha a bemenet negatív vagy nulla
    if (n <= 0) {
        return false;
    }
    while (n % 3 == 0) {
        // Amíg n osztható hárommal, addig osztjuk
        n /= 3;
    }

      // Ha n végül egyenlő 1-gyel, akkor hatványa a háromnak
    return n == 1;
}

}