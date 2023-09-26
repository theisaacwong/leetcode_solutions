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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode myNode = new ListNode();
        int carry = 0;
        ListNode currNode = myNode;

        while(l1 != null || l2 != null || carry != 0){
            int l1val = l1 != null ? l1.val : 0;
            int l2val = l2 != null ? l2.val : 0;

            int val = l1val + l2val + carry;
            ListNode newNode = new ListNode(val % 10);
            carry = val / 10;
            currNode.next = newNode;
            currNode = currNode.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        return(myNode.next);
    }
}
