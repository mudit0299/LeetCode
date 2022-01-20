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
        // ListNode list1=l1;
        // ListNode head=l1;
        // ListNode list2=l2;
        // int carry=0;
        // while(l1!=null || l2!=null){
        //     if(l1==null){
        //         l1.val=0;
        //     }
        //     if(l2==null){
        //         l2.val=0;
        //     }
        //     l1.val=l1.val+l2.val+carry;
        //     if(l1.val>9){
        //         carry=l1.val-9;
        //         l1.val=l1.val-10;
        //     }else{
        //         carry=0;
        //     }
        //    // System.out.println(l1.val+","+l2.val+","+carry);
        //     if(l1==null){
        //         l2=l2.next;
        //     }else if(l2==null){
        //         l1=l1.next;
        //     }else{
        //     l1=l1.next;
        //     l2=l2.next;
        //     }
        // }
        // return head;
            int carry = 0;
    ListNode p, dummy = new ListNode(0);
    p = dummy;
    while (l1 != null || l2 != null || carry != 0) {
        if (l1 != null) {
            carry += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            carry += l2.val;
            l2 = l2.next;
        }
        p.next = new ListNode(carry%10);
        carry /= 10;
        p = p.next;
    }
    return dummy.next;
    }
}