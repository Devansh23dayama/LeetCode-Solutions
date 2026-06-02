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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int count = 1;
        ListNode curr = head;
        while (curr.next!= null) {
            count++;
            curr = curr.next;
        }
        k = k % count;
        if (k == 0) {
            return head;
        }
        //circular
     curr.next=head;
     int length= count -k;
     ListNode newTail =head;
     for(int i = 0; i<length-1;i++){
        newTail=newTail.next;

     }
     ListNode newHead = newTail.next;
     newTail.next=null;

     return newHead;
    }
}