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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode copy1 = l1;
        ListNode copy2 = l2;
        ListNode head = new ListNode(0);
        ListNode dummy = head;
        
        while(copy1!=null && copy2!=null) {
            if (copy1.val<copy2.val) {
                dummy.next = copy1;
                copy1 = copy1.next;
            } else {
                dummy.next = copy2;
                copy2 = copy2.next;
            }
            dummy = dummy.next;
        }
        if (copy1!=null) {
            dummy.next = copy1;
        }
        if (copy2!=null) {
            dummy.next = copy2;
        }
        return head.next;
    }
}