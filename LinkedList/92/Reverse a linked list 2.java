/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    private void reverse(ListNode start, ListNode stop){
        ListNode curr = start;
        ListNode prev = start;
        ListNode tmp = start.next;
        while(curr!=stop){
            curr = tmp;
            tmp = tmp.next;
            curr.next= prev;
            prev = curr;
        }
    }
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode stop = head;
        ListNode star = head;
        ListNode firstpart = null;
        ListNode secondpart = null;
        
        if(n==1) return head;  //special case
        
        //locate star
        while(n>1){
            star = star.next;
            n--;
        }
        secondpart = star.next;
        //if stop is head, redirect head to star.
        if(m==1){
            //reverse(stop,star);
            //stop.next = secondpart;
            head = star;
        } else{
            // locate stop
            while(m>1){
                if(m==2){
                    firstpart = stop;  // find the node before stop.
                }
                stop = stop.next;
                m--;
            }
            firstpart.next = star;
        }
            reverse(stop,star);
            stop.next =  secondpart;
            return head;
    }
}