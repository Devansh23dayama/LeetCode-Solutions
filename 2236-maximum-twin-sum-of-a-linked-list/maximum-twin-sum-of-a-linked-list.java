/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
     ListNode slow=head;
     ListNode fast= head;

     while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
     }
     ListNode prev=null; 
     ListNode curr=slow;

     while(curr!=null){
        ListNode fwd=curr.next;
        curr.next=prev;
        prev=curr;
        curr=fwd;
     }
     int max=0;
     ListNode curr1=head;
     ListNode curr2=prev;
     while(curr2!=null){
        max=Math.max(max,curr1.val+curr2.val);
        curr1=curr1.next;
        curr2=curr2.next;
     }
return max;
    }
}