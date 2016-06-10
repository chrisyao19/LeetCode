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
        
        // if(head==null || head.next==null) {
        //     return head;
        // }
        // ListNode prev = head;
        // ListNode curr = head.next;
        // while(curr!=null) {
        //     if(curr.val==prev.val) {
        //         prev.next = curr.next;
        //     } else {
        //         prev = curr;
        //     }
        //     curr = curr.next;
        // }
        // return head;
        
        
        //Solution2: using just 1 node
        // if(head==null || head.next==null) {
        //     return head;
        // }
        // ListNode tmp = head;
        // while(tmp.next!=null) {
        //     if(tmp.val==tmp.next.val) {
        //         tmp.next = tmp.next.next;
        //     } else {
        //         tmp = tmp.next;
        //     }
        // }
        // return head;
        
        //Solution3: Recursion, easy to implement
        if(head==null || head.next==null) {
            return head;
        }
        head.next = deleteDuplicates(head.next);
        return head.val==head.next.val?head.next:head;
    }
}