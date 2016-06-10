/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) {
            return;
        }
        // ListNode start = head; ListNode end = head;
        // ListNode fake = new ListNode(-1); ListNode prev = fake;
        // fake.next = head;
        // while(end.next!=null) {
        //     prev = prev.next;
        //     end = end.next;
        // }
        // end.next = start.next;
        // start.next = end;
        // prev.next = null;
        // reorderList(end.next);
        ListNode start = head; ListNode stop = head; ListNode end = head;
        //find the stop point.
        while(end!=null && end.next!=null) {
            end = end.next.next;
            stop = stop.next;
        }
        //reverse the later half of the list eg:1->2->3->4->5  convert to: 1->2->3<-4<-5. stop at 3.
        end = stop.next;
        ListNode prev = stop;
        ListNode tmp = end;
        while(end!=null) {
            end = end.next;
            tmp.next = prev;
            prev = tmp;
            tmp = end;
        }
        end = prev;
        
        //reorder the list 
        ListNode next_start = start;
        ListNode next_end = end;
        while(end!=stop) {
            next_start = start.next;
            next_end = end.next;
            end.next = next_start;
            start.next = end;
            end = next_end;
            start = next_start;
        }
        // the last node's next field points to null.
        end.next = null;
    }
}