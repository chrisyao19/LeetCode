/* Revome a node in a singly-linked list. Given access to only that node */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void deleteNode(ListNode node) {
        if(node.next != null){
            node.val = node.next.val;
            node.next = node.next.next;
            
        }
        
    }
}

/* I tried to use node = node.next; to delete the node. But it turned out that nothing happened.
   Because the parameter "node" is just an reference, it just points to the object in the Heap.
   So even I made node points to another node. I can't access the node which is the prev node of 
   "node", so the prev node's next still points to "node". Therefore, nothing happened.
*/
