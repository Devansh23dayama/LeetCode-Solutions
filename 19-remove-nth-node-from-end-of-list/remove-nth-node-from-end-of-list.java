class Solution {
    int findlength(ListNode head) {

        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    ListNode delete(ListNode head, int deleteAt) {
     if(head.next==null){
        return null;
     }

        ListNode curr = head;
        while (deleteAt > 1) {
            curr = curr.next;
            deleteAt--;
        }
        curr.next = curr.next.next;
        return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = findlength(head);
        int deleteAt = length - n ;
        if(deleteAt==0){
            return head.next;
        }
        head = delete(head, deleteAt);
        return head;

    }
}