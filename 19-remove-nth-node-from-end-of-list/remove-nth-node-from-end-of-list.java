class Solution { 
    public ListNode removeNthFromEnd(ListNode head, int n) { 
        if(head.next==null){return null;} 
        int count = 0; 
        ListNode temp = head; 
        while (temp != null) { 
            count++; 
            temp = temp.next; 
        } 
 
        int x = count - n + 1;   
        if (x == 1) { 
            return head.next; 
        } 
        if (x == count) { 
            ListNode t = head; 
            while (t.next.next != null) { 
                t = t.next; 
            } 
            t.next = null; 
            return head; 
        } 
        int i = 2; 
        ListNode prev = head; 
 
        while (i < x) { 
            i++; 
            prev = prev.next; 
        } 
 
        prev.next = prev.next.next; 
        return head; 
    } 
} 