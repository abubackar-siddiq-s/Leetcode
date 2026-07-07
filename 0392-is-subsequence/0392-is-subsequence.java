class Solution {
    public boolean isSubsequence(String s, String t) {
        int top = 0;
        for (int i = 0; i < t.length() && top < s.length(); i++) {
            if (t.charAt(i) == s.charAt(top)) {
                top++;
            }
        }
        return top == s.length() ? true : false;
    }
}