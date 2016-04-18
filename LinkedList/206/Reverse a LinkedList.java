// Reverse a LinkedList
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        // ListNode pre = null;
        // ListNode curr = head;
        // while(curr != null){
        //     ListNode temp = curr.next;     //Once curr.next changed, there's no way to get the original curr.next, so temp is made to store the next node of curr.
        //     curr.next = pre;
        //     pre = curr;
        //     curr = temp;
        // }
        // return pre;
        if(head == null || head.next == null) {return head;}
        else{
            ListNode temp = reverseList(head.next);  // To get access to the last node and return it.
            head.next.next = head;              // *important* I tried temp.next = head; at first, but it turns out that the result is only 2 elements.
            head.next = null;                   /* *important* it's necessary to point out the last node's next field points to null in each recursion.
                                                    and it can't be set to null before the head.next.next = head; because the original next node will be lost.*/
            return temp;                        // always return the first node in each resursion.
        }
        
    }
}

/* Iteration is much easier than recursion in this case.
   To implement recursion in this situation, I must know that first I need a way to get access
   to the last node, and then point it to the previous one. There are lots of mistakes I made 
   when I was trying to implement it.