/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //Solution1 Iteration way
        // ListNode head = new ListNode(-1);
        // ListNode tmp = head;
        // while(l1!=null && l2!=null) {
        //     if(l1.val<l2.val) {
        //         ListNode newnode = new ListNode(l1.val);
        //         tmp.next = newnode;
        //         l1 = l1.next;
        //         //System.out.println(l1.val);
        //     } else if(l1.val > l2.val) {
        //         ListNode newnode = new ListNode(l2.val);
        //         tmp.next = newnode;
        //         l2 = l2.next;
        //     } else {
        //         ListNode newnode1 = new ListNode(l1.val);
        //         ListNode newnode2 = new ListNode(l2.val);
        //         tmp.next = newnode1;
        //         tmp = tmp.next;
        //         tmp.next = newnode2;
        //         l1 = l1.next;
        //         l2 = l2.next;
        //     }
        //     tmp = tmp.next;
        // }
        //     while(l1!=null) {
        //         ListNode newnode = new ListNode(l1.val);
        //         tmp.next = newnode;
        //         l1 = l1.next;
        //         tmp = tmp.next;
        //     }
       
        //     while(l2!=null) {
        //         ListNode newnode = new ListNode(l2.val);
        //         tmp.next = newnode;
        //         l2 = l2.next;
        //         tmp = tmp.next;
        //     }
        // return head.next;
        
        //Solution2: Recursion way
        ListNode tmp;
        if(l1==null) {
            return l2;
        }
        if(l2==null) {
            return l1;
        }
        
        if(l1.val<l2.val) {
            tmp = l1;
            tmp.next = mergeTwoLists(l1.next, l2);
        } else {
            tmp = l2;
            tmp.next = mergeTwoLists(l1, l2.next);
        }
        return tmp;
    }
}