
class Solution {
    public void deleteNode(ListNode node) {

        // Step 1: Copy the next node's value
        node.val = node.next.val;

        // Step 2: Skip the next node
        node.next = node.next.next;
    }
}
