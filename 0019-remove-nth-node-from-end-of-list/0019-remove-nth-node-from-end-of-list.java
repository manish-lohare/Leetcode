class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Step 1: Count total nodes
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // Step 2: Special case: remove head
        if (n == size) {
            return head.next;
        }

        // Step 3: Traverse to node before the one to remove
        ListNode curr = head;
        for (int i = 1; i < size - n; i++) {
            curr = curr.next;
        }

        // Step 4: Remove the nth node from end
        curr.next = curr.next.next;

        return head;
    }
}
