
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head.next==null){
        return null;
    }
        ListNode prev=head;
        ListNode slow=head;
        ListNode fast=head;
    for(int i=0;i<n;i++){
        fast=fast.next;
    }
        while(fast!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next;
        }
        if(slow==head){
            return head.next;
        }
      prev.next=slow.next;
      return head;
    }
}