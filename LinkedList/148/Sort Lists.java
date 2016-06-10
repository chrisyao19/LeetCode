/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode fast = head; ListNode slow = head; ListNode prev = null;
        ListNode left =null; ListNode right = null;
        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = null;
        left = sortList(head); right = sortList(slow);
        //sort begin
        ListNode fakehead = new ListNode(-1); ListNode tmp = fakehead;
        while(left!=null && right!=null) {
            if(left.val>=right.val) {
                tmp.next = right;
                right = right.next;
            } else {
                tmp.next = left;
                left = left.next;
            }
            tmp = tmp.next;
        }
        tmp.next = left==null?right:left;
        // if(left!=null) {
        //     while(left!=null) {
        //         tmp.next= left;
        //         left = left.next;
        //         tmp = tmp.next;
        //     }
        // }
        // if(right!=null) {
        //     while(right!=null) {
        //         tmp.next = right;
        //         right = right.next;
        //         tmp = tmp.next;
        //     }
        // }
      return fakehead.next;
    }
}