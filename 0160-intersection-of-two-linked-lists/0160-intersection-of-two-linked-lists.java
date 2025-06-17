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
        int Asize=0;
        int Bsize=0;

        ListNode A=headA;
        ListNode B=headB; 

        while(A!=null){
            Asize++;
            A=A.next;
        }

        
        while(B!=null){
            Bsize++;
            B=B.next;
        }

        while(Asize>Bsize){
            Asize--;
            headA=headA.next;
        }
        while(Bsize>Asize){
            Bsize--;
            headB=headB.next;
        }

        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}