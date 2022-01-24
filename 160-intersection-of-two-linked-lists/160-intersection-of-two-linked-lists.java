/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode temp=headA;
        ListNode temp2=headB;
        int lena=0;
        int lenb=0;
        while(temp!=null){
            lena++;
            temp=temp.next;
            
        }
        while(temp2!=null){
            lenb++;
            temp2=temp2.next;
        }
        System.out.println(lena);
        System.out.println(lenb);
        temp=headA;
        temp2=headB;
        
        if(lena>lenb){
            int diff=lena-lenb;
            while(diff>0){
                temp=temp.next;
                System.out.println(diff);
                diff--;
                
            }
                    System.out.println(diff);

        }
    
            if(lenb>lena){
            int diff=lenb-lena;
            while(diff>0){
                temp2=temp2.next;
                System.out.println(diff);
                diff--;
                
                
            }
                        System.out.println(diff);

            }
        
                while(temp!=temp2){
                    
                        
                    
                       temp=temp.next;
                        temp2=temp2.next; 
                    }
                
            
        
    return temp;
}
}