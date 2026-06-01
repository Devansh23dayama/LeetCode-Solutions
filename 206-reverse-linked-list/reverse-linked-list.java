
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode fwd=null;
        ListNode curr= head;
        ListNode prev= null;
    while(curr!=null){
        fwd=curr.next;
        curr.next=prev;
        prev=curr;
        curr=fwd;
    }
    return prev;
    }
}