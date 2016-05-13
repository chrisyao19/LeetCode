/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null) return head; //special case
        ListNode prev = head; ListNode curr = head.next;
        if(curr.next==null) {
            prev.next = curr.next;     //if curr is the last node, swap it with the previous one
        } else {
            ListNode tmp = swapPairs(curr.next);  //call the swap recursively, every time it is called, swap 2 nodes.
            prev.next = tmp;
        }
        curr.next = prev;     //the common part
        head = curr;          //the common part
        return head;
    }
}