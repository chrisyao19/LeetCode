/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode fakehead = new ListNode(-1);
        fakehead.next = head;
        ListNode tmp = head; 
        ListNode curr = head.next;
        ListNode prev = fakehead;
        while(curr!=null) {
            if(curr.val!=tmp.val) {
                prev = tmp;
                tmp = curr;
                curr = curr.next;
            } else {
                while(curr.next!=null && curr.next.val==tmp.val) {
                    curr = curr.next;
                }
                prev.next = curr.next;
                tmp = curr.next;
                if(curr.next!=null) {
                curr = tmp.next;
                } else {
                    curr = null;
                }
            }
        }
        return fakehead.next;
    }
}