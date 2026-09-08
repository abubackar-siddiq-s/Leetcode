class Solution {
    public String decodeMessage(String key, String mes) {
        HashMap hm = new HashMap();
        char x = 'a';
        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            if (ch != ' ' && !hm.containsKey(ch)) {
                hm.put(ch, x);
                x++;
            }
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < mes.length(); i++) {
            char ch = mes.charAt(i);
            if (ch == ' ') {
                s.append(' ');
            } else {
                s.append(hm.get(ch));
            }
        }
        return s.toString();
    }
}