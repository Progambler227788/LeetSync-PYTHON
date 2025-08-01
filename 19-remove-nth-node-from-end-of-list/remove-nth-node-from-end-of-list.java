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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode slow=head, fast = head;
        ListNode dummy = head;
        while (n>0){
            fast = fast.next;
            n-=1;
        }

        if (fast==null) return head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy;


        
    }
}