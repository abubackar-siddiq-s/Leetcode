class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;
        int l = 0;
        HashSet<Character> h = new HashSet<>();
        for (int r = 0; r < n; r++) {
            char ch = s.charAt(r);
            while (h.contains(ch)) {
                h.remove(s.charAt(l));
                l++;
            }
            h.add(ch);
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}