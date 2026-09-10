/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        if (head.next == null) {
            return head;
        }
        ListNode nxt = head.next;
        while (nxt != null) {
            int a = temp.val;
            int b = nxt.val;
            ListNode x = new ListNode(gcd(a, b));
            temp.next = x;
            x.next = nxt;
            temp = nxt;
            nxt = nxt.next;
        }
        return head;
    }
}