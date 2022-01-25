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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode ref=head;
        for(int i=0;i<k-1;i++){
            fast=fast.next;
            slow=slow.next;
        }
        while(fast.next!=null){
            ref=ref.next;
            fast=fast.next;
        }
        
       
        
        int temp=slow.val;
        slow.val=ref.val;
        ref.val=temp;
        return head;
        
    }
}