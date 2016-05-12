/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
      if(head == null || head.next==null) return true;
    //   if(head.next.next==null){
    //       if(head.val == head.next.val){
    //           return true;
    //       }else 
    //       return false;
    //   }
      
      ListNode fast = head;
      ListNode slow = head;
      ListNode pre = head;
      ListNode tmp = head.next;
      
      
      while(fast.next!=null && fast.next.next!=null) {
          fast = fast.next.next;
          pre = slow;
          slow = tmp;
          tmp = tmp.next;   //must be written before slow.next = pre;
          slow.next = pre;

         
      }
      if(fast.next==null){
          slow = slow.next;
      }
      while(tmp!=null){
          System.out.println(tmp.val);
          System.out.println(slow.val);
          if(tmp.val!=slow.val) {
              return false;
          } else{
              tmp = tmp.next;
              slow = slow.next;
          }
      }
      return true;
    }
}
    //First, we use two pointers fast, and slow, to get the mid-node of the list, while we walk though the list using slow, we
    //revers it's order, then slow get to the mid point, we can compare every listnode in two halves by using "next".



