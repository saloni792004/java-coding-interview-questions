/**
 * Definition for singly-linked list.
 * This class represents a single node in the chain.
 */
class ListNode {
    int val; // The value of the node
    ListNode next; // A pointer to the next node in the list

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        // 'previous' will eventually be the new head of the reversed list.
        ListNode previous = null;
        
        // 'current' starts at the head of the original list.
        ListNode current = head;

        // We loop until we've processed every node.
        while (current != null) {
            // 1. Store the next node before we break the link.
            ListNode nextTemp = current.next; 
            
            // 2. Reverse the link: point the current node's 'next' backwards.
            current.next = previous;
            
            // 3. Move our pointers one step forward for the next loop.
            previous = current;
            current = nextTemp;
        }

        // At the end, 'previous' is the new head of the reversed list.
        return previous;
    }
}
