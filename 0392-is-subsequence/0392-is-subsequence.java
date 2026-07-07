class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0, top = 0;
        for (int i = 0; i < t.length() && top < s.length(); i++) {
            if (t.charAt(i) == s.charAt(top)) {
                count++;
                top++;
            }
        }
        return count == s.length() ? true : false;
    }
}