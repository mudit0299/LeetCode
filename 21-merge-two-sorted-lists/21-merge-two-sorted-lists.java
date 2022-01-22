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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
          ListNode dummy=new ListNode();
          ListNode tail=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                ListNode nn=new ListNode(list1.val);
                tail.next=nn;
                list1=list1.next;
                tail=nn;
            }else{
               ListNode nn=new ListNode(list2.val);
                tail.next=nn;
                list2=list2.next;
                tail=nn; 
                
            }
        }
        while(list1!=null){
          ListNode nn=new ListNode(list1.val);
                tail.next=nn;
                list1=list1.next;
                tail=nn;  
        }
        while(list2!=null){
            ListNode nn=new ListNode(list2.val);
                tail.next=nn;
                list2=list2.next;
                tail=nn; 
        }
        
        return dummy.next;
    }
}