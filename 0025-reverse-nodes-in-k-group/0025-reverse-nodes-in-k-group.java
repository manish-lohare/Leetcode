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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode pre=null;
        ListNode next=null;
        ListNode curr=head;
        int c=k;
        while(curr!=null && c>0){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
            c--;
        }
        if(curr==null && c>0){
         curr=pre;
         pre=null;
         next=null;
        
        while(curr!=null ){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
            
            }
        }
        if(c>0){
            return pre;
        }
        else{
            head.next=reverseKGroup( curr, k);
        }
        return pre;
    }
}