class Solution {
    public String firstPalindrome(String[] w) {
        String str = "";
        for (int i = 0; i < w.length; i++) {
            int l = 0, r = w[i].length() - 1;
            int flag = 0;
            while (l < r) {
                if (w[i].charAt(l) != w[i].charAt(r)) {
                    flag = 1;
                }
                l++;
                r--;
            }
            if (flag == 0) {
                str = w[i];
                return str;
            }
        }
        return str;
    }
}