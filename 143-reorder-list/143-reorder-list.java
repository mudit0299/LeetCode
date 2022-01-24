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
    public void reorderList(ListNode head) {
        if(head==null ||head.next==null) {
		return;
	}
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null) {
        	slow=slow.next;
        	fast=fast.next.next;
        }
        
        ListNode prev=null;
        ListNode curr=slow;
        ListNode next=curr.next;
        
        
        
        while(curr!=null) {
        	curr.next=prev;
        	prev=curr;
        	curr=next;
        	if(next!=null) {
        		next=next.next;
        	}
        }
        
        
        //last.next=newEnd;
        ListNode hf=head;
        ListNode hs=prev;
        while(hf!=null && hs!=null) {
        	ListNode temp1=hf.next;
        	ListNode temp2=hs.next;
        	hf.next=hs;
        	hf=temp1;
        	hs.next=hf;
        	hs=temp2;
        }
        if(hf!=null) {
        	 hf.next=null;
        }
        
       
        
        
    
    }
}