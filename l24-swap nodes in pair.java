class Solution {
    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode temp = null;
        ListNode current = head;
        head = head.next;

        while(current != null && current.next != null)
        {
            ListNode second = current.next;
            ListNode third = current.next.next;

            second.next = current;
            current.next = third;

            if(temp != null)
            {
                temp.next = second;
            }

            temp = current;
            current = third;
        }

        return head;
    }
}