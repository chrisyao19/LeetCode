/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(size(head)<k) return head;
        ListNode walk = head;
        ListNode next = null;
        int i = 1;
        while(i<k) {
            walk = walk.next;
            i++;
        }
        next = walk.next;
        walk.next = null;   
        //call the reverseKG recursively.
        walk = reverse(head);
        next = reverseKGroup(next,k);
        head.next = next;
        return walk;
    }
    public int size(ListNode head) {
        ListNode tmp= head;
        int total=0;
        while(tmp!=null) {
            total++;
            tmp=tmp.next;
        }
        return total;
    }
    private ListNode reverse(ListNode head) {
        if(head==null) return head;
        ListNode prev = null; ListNode curr = head;
        ListNode tmp = null;
        while(curr!=null) {
            tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;            //Important: can't return curr, curr points to null, should return prev.
    }
}