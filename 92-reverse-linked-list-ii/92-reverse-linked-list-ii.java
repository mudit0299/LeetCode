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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(left==right){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        
        for(int i=0;i<left-1 && curr!=null ;i++){
            prev=curr;
            curr=curr.next;
        }
        
        ListNode last=prev;
        ListNode newEnd=curr;
        ListNode next=curr.next;
        for(int i=0;curr!=null && i<right-left+1;i++){
            //System.out.println(last.val+","+newEnd.val+","+curr.val);
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null){
                next=next.next;
            }
        }
        if(last==null){
            head=prev;
            
        }else{
            last.next=prev;
        }
        newEnd.next=curr;
        return head;
    }
}