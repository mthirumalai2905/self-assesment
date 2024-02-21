package Test7;

public class reverse {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode next = null;
            ListNode current = head;

            while(current != null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            return prev;
        }
    }
}
