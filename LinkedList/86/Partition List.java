/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        //Solution1: 2 Iteration
        // if(head==null || head.next==null) return head;d
        // ListNode result = new ListNode(-1); ListNode tmp = head;
        // ListNode tail = result;
        // while(tmp!=null) {
        //     if(tmp.val<x) {
        //         tail.next = new ListNode(tmp.val);
        //         tail = tail.next;
        //     } 
        //     tmp = tmp.next;
        // }
        // tmp = head;
        // while(tmp!=null) {
        //     if(tmp.val>x|| tmp.val==x) {
        //         tail.next = new ListNode(tmp.val);
        //         tail = tail.next;
        //     } 
        //     tmp = tmp.next;
        // }
        // return result.next;
        
        //Solution2: in place   Rather slow
        // if(head==null||head.next==null) return head;
        // ListNode fakehead = new ListNode(-1);
        // fakehead.next = head;
        // ListNode tail = fakehead;ListNode part_two = fakehead; ListNode prev = fakehead;
        // ListNode tmp = head;
        // while(tmp!=null) {
        //     if(tmp.val>=x && part_two==fakehead) {
        //         part_two = tmp;
        //         prev = tmp;
        //         tmp = tmp.next;
        //         System.out.println("parttwo assigned");
        //     } else if(tmp.val>=x) {
        //         prev = tmp;
        //         tmp = tmp.next;
        //     } else if(tmp.val<x) {
        //             if(part_two!=fakehead){
        //                 prev.next = tmp.next;
        //             }
        //         tail.next = tmp;
        //         tail = tail.next;
        //         tmp = tmp.next;
        //     }
        // }
        // if(part_two==fakehead) part_two=null;   //avoid circle
        // tail.next = part_two;
        // return fakehead.next;
        
        //Solution3 O(n) time simple   according to discussion
        if(head==null || head.next==null) return head;
        ListNode small = new ListNode(-1); ListNode big = new ListNode(-1);
        ListNode tmp1 = small; ListNode tmp2 = big;
        while(head!=null) {
            if(head.val<x) {
                tmp1.next = head;
                tmp1 = tmp1.next;
            } else {
                tmp2.next = head;
                tmp2 = tmp2.next;
            }
            head = head.next;
        } 
        tmp2.next = null;
        tmp1.next = big.next;
        return small.next;
    }
}