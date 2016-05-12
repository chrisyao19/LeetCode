/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // if(head==null) return head;
        // if(head.next==null){
        //     if(head.val==val) return head.next;
        //     return head;
        // }
        // while(head.val==val){
        //     head = head.next;
        //     if(head==null) return head;
        // }
        // ListNode prev = head;
        // ListNode curr = head.next;
        // while(curr!=null){
        //     if(curr.val == val){
        //         prev.next = curr.next;
        //     }else{
        //     prev = prev.next;
        //     }
        //     curr = curr.next;
        // }
        // return head;
        
        //Better solution1: avoid eage cases, using fakehead
        // ListNode fakehead = new ListNode(-1);
        // fakehead.next = head;
        // ListNode prev = fakehead;
        // ListNode curr = head;
        // while(curr!=null) {
        //     if(curr.val==val) {
        //         prev.next = curr.next;
        //     } else {
        //         prev = prev.next;
        //     }
        //     curr = curr.next;
        // }
        // return fakehead.next;
        
        //Solution2:Recursion, easy to implement
        if(head == null) return head;
        ListNode next = removeElements(head.next, val);
        if(head.val==val) return next;
        head.next = next;
        return head;
    }
}
        //the recursion way is more easier to implement, suppose the head's next has remove the element val, using the function removeElements itself, then assign head to itself or its next, depend on its value

