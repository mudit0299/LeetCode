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
    public int getDecimalValue(ListNode head) {
        if(head==null){
            return 0;
        }
        ListNode temp=head;
        String ans="";
        while(temp!=null){
            ans=ans+temp.val;
            temp=temp.next;
        }
        int ans1=Integer.parseInt(ans,2);
        return ans1;
        
    }
}