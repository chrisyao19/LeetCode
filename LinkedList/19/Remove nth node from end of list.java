/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //use fakehead to avoid edge cases, that is the removing head case.
        if(head==null) return head;
        //if(head.next==null) return null; if fakehead is used, this case is no need to write out.
        ListNode fast = head;
        ListNode fakehead = new ListNode(-1);
        ListNode tmp = fakehead;
        fakehead.next = head;
        int difference = n;
        int i=0;
        //make node fast move n-1 faster than tmp.
        while(fast!=null) {
            fast = fast.next;
            if(i!=difference) {
                i++;
                continue;
            } else {
                //System.out.println("a");
                tmp = tmp.next;
            }
        }
        //System.out.println(tmp.val);
        tmp.next = tmp.next.next;
        return fakehead.next;
    }
}