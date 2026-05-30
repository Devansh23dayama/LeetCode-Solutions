
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode curr=head;
        while(curr!=null){
            if(set.contains(curr)){
                return true;
            }
            set.add(curr);
            curr= curr.next;
        }
        return false;
    }
}