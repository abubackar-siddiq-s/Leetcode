class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            int x = n;
            int sum = 1;
            while (x > 0) {
                sum *= x % 10;
                x /= 10;
            }
            if (sum % t == 0) {
                return n;
            }
            n++;
        }
    }
}