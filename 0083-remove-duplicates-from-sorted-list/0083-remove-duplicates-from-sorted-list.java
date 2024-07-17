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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> values = new HashSet<>();
        
        ListNode prev = null;
        ListNode current = head;
        
        while(current != null){
            if (values.contains(current.val)){
                prev.next = current.next;
            } else {
                values.add(current.val);
                prev = current;
            }
            current = current.next;
        }
        
        return head;
    }
}
