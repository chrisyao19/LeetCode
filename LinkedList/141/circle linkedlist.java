//Determint if a LinkedList is a circle list.


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public boolean hasCycle(ListNode head) {
        // Solution 1.
        if(head == null) return false;
        //if(head.next == null) return false;
        ListNode start = head;
        ListNode end = head;
        while(true){
            if(end.next == null) return false;
            if(end.next.next == null) return false;
            end = end.next.next;
            start = start.next;
            if(end == start) return true;
        }


        //Solution 2.
        HashSet<ListNode> nodeSeen = new HashSet<>();
        while(head != null){
            //if(head.next == null) return false;  //no need.
            if(nodeSeen.contains(head)) return true;
            nodeSeen.add(head);
            head = head.next;
        }
        return false;




    }
}
 /*At first I thought the only possible situation is the last of the node connect with the first one.
   Then a friend told me the last node can connect to any node in the list. Thus, It can't be judged 
   by using last.next == head;
 */

 /* There's another way, using HashSet to track down every node's hashcode, if the current node has been
    seen in the HashSet, then it's a circle linkedlist.
 */