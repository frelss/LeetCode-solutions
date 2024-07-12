class Solution {
    public boolean squareIsWhite(String coordinates) {
        int c = coordinates.charAt(0) - 'a' + 1;
        int r = coordinates.charAt(1) - '0';
        return (c + r) % 2 != 0; 
    }
}
