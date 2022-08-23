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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s=new Stack<>();
        ListNode t=head;
        while(t!=null) {
            s.push(t.val);
            t=t.next;
        }
        while(!s.isEmpty()) {
            if(head.val != s.pop()) {
                return false;
            }
            head=head.next;
        }
        return true;
    }
}