// Group all odd nodes together followed by even odds.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next ==null){
            return head;
        }
        else{
        ListNode p1 = head;
        ListNode p2 = head.next;
        ListNode temp = head.next;
        do{
            p1.next = p2.next;          //Odd and even pointers must move forward one by one.
            p1 = p1.next;
            p2.next = p1.next;
            p2 = p2.next;
        }while(p1.next!=null && p2.next !=null);
        p1.next = temp;
        return head;
        }
    }
}

    /*During the implementation I made some NullPointerExceptions by using p1.next = p1.next.next; */