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
    public ListNode sortList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;

        if(head==null || head.next==null){
            return head;
        }
        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;

        }
        temp.next=null;
        
        ListNode left=sortList(head);
        ListNode right=sortList(slow);

        return merge(left, right);

    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode sortTemp=new ListNode(0);
        ListNode currNode=sortTemp;

        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                currNode.next=l1;
                l1=l1.next;
            }
            else{
                currNode.next=l2;
                l2=l2.next;
            }
            currNode=currNode.next;

        }
        if(l1!=null){
            currNode.next=l1;
            l1=l1.next;
        }
        if(l2!=null){
            currNode.next=l2;
            l2=l2.next;

        }

        return sortTemp.next;
    }
}