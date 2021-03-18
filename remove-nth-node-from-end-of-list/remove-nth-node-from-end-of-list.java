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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        int length = 0;

        ListNode ref = head;
        while (ref!=null) {
            length++;
            ref = ref.next;
        }
        length = length - n;
        ref = newHead;
        while (length>0) {
            length--;
            ref = ref.next;
        }
        ref.next = ref.next.next;
        return newHead.next;
    }
}