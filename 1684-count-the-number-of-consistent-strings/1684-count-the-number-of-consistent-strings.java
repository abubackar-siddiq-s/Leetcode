class Solution {
    public int countConsistentStrings(String a, String[] w) {
        int count = 0;
        for (int i = 0; i < w.length; i++) {
            boolean flag = true;
            for (int j = 0; j < w[i].length(); j++) {
                if (a.indexOf(w[i].charAt(j)) == -1)
                    flag = false;
            }
            if (flag)
                count++;
        }
        return count;
    }
}