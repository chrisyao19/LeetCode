/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode fakehead = new ListNode(-1);
        fakehead.next = head;
        ListNode tmp = head.next;
        ListNode curr = tmp.next;
        ListNode prev = head;
        while(tmp!=null) {
            if(tmp.val>=prev.val) {
                prev = tmp;
                tmp = tmp.next;
            } else {
                ListNode pass = fakehead.next;
                curr = tmp.next;
                prev.next = curr;
                if(pass.val>=tmp.val) {
                    tmp.next = pass;
                    fakehead.next = tmp;
                    //System.out.println(fakehead.next.val==-9);
                    tmp = curr;
                    //System.out.println(tmp.val);
                } 
                    else {
                    //System.out.println(tmp.val);
                    while(pass!=prev) {
                        if(pass.val<tmp.val && pass.next.val>tmp.val) {
                            tmp.next = pass.next;
                            pass.next = tmp;
                            tmp = curr;
                            break;
                        }
                        pass = pass.next;
                        //System.out.println(pass.val);
                    }   
                    }   
                }
                System.out.println(fakehead.next.val);
        }
        return fakehead.next;
        
        
        // if(head==null) return head;
        // ListNode fakehead = new ListNode(-1);
        // ListNode curr = head; 
        // ListNode prev = fakehead;
        // ListNode next = null;
        // while(curr!=null) {
        //     next = curr.next;
        //     while(prev.next!=null && prev.next.val<curr.val){
        //         prev = prev.next;
        //     }
        //     curr.next = prev.next;
        //     prev.next = curr;
        //     curr = next;
        //     prev = fakehead;
        // }
        // return fakehead.next;
        
        
    
}
}