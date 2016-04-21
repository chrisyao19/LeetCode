//return the beginning node of the circle of a linkedlist, if not return null.

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
    public ListNode detectCycle(ListNode head) {
    	//Solution1 HashSet
        HashSet<ListNode> nodeSeen = new HashSet<>();
        while(head != null){
            if(nodeSeen.contains(head)) return head;
            else{
                nodeSeen.add(head);
                head = head.next;
            }
        }
        return null;

        //Solution2 In order to get O(1) space.
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next !=null){
        	slow = slow.next;
        	fast = fast.next.next;
        	if(slow == fast){
        		ListNode slow1 = head;
        		while(slow1 != slow){
        			slow1 = slow1.next;
        			slow = slow.next;
        		}
        		return slow;
        	}
        }
        return null;
    }
}

	/* first let 2 pointers, slow and fast, to walk through the list. As long as they encoutered, the fast pointer must
	go at least 1 more circle in the list than the slow one. Then let another pointer to go from the head together with
	the slower pointer, when they meet each other, the node is what we need. */


