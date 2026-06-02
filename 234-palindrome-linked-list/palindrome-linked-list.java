
class Solution {
    public boolean isPalindrome(ListNode head) {
        //middle
       ListNode slow=head;
       ListNode fast= head.next;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    //break ll in 2 parts
    ListNode middle=slow.next;
    slow.next=null;

    //reverse middle ll  and compare 

    ListNode curr=middle;
    ListNode prev=null;
    ListNode fwd=middle;

    while(curr!=null){
        fwd=curr.next;
        curr.next=prev;
        prev=curr;
        curr=fwd;
    }

    ListNode curr1= head;
    ListNode curr2=prev;

    while(curr2!=null){
     if(curr1.val != curr2.val){
        return false;
     }
     curr1=curr1.next;
     curr2=curr2.next;
    } 

return true;
    }
}