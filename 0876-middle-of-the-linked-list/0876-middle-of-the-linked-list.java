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
    public ListNode middleNode(ListNode head) {
        ListNode m = head;
	    ListNode f = head;
 
	    while (f != null && f.next != null) {
		    m = m.next;
		    f = f.next.next;
	    }
 
	    return m;
    }
}